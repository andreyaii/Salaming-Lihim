package Core;

import Audio.MusicPlayer;
import Storyline.BeggarEvent;
import java.util.*;

public class BattleManager {
    Scanner scanner = new Scanner(System.in);

    private String bar(int current, int max, String fillChar, String emptyChar) {
        int length = 20;
        int filled = max > 0 ? (int) ((double) current / max * length) : 0;
        StringBuilder b = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            b.append(i < filled ? fillChar : emptyChar);
        }
        b.append("] ").append(current).append("/").append(max);
        return b.toString();
    }

    public boolean startBattle(PlayerCharacter player, List<Enemy> enemies, int currentWorld, boolean isBossBattle) {

        // ── ADDED: battle music ───────────────────────────────────
        MusicPlayer.play(MusicPlayer.BATTLE_BEGIN, false);
        try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
        MusicPlayer.play(MusicPlayer.BATTLE, true);

        System.out.println("                                                      ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("                                                      █              ⚔ ️ Battle Begins!             █");
        System.out.println("                                                      ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

        while (player.isAlive() && !enemies.isEmpty()) {

            System.out.println("\n                                                       ┏━PLAYER STATUS───────────────────────────━┓");
            System.out.println("                                                         HP   " + bar(player.getHp(),   player.maxHp,   "█", "░"));
            System.out.println("                                                         Mana " + bar(player.getMana(), player.maxMana, "▓", "░"));
            System.out.println("                                                       ┗━────────────────────────────────────────━┛");

            System.out.println("\n👹 ENEMIES");
            for (int i = 0; i < enemies.size(); i++) {
                Enemy e = enemies.get(i);
                System.out.printf("[%d] %s  HP %s\n", i, e.name,
                        bar(e.hp, 150, "█", "░"));
            }

            int targetIndex;
            while (true) {
                try {
                    System.out.print("🎯 Choose target index: ");
                    targetIndex = scanner.nextInt();
                    if (targetIndex < 0 || targetIndex >= enemies.size()) {
                        System.out.println("Invalid target. Try again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid target index or target is already defeated.");
                } catch (InputMismatchException e) {
                    System.out.println("Please input a valid index.");
                    scanner.nextLine();
                }
            }

            Enemy target = enemies.get(targetIndex);
            int action = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.println("\n┏━━⚡ Actions:━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                System.out.println("┃ [1] Basic Attack                      ┃");
                System.out.println("┃ [2] Skill                             ┃");
                System.out.println("┃ [3] Special Skill                     ┃");
                System.out.println("┃ [4] Use Item                          ┃");
                System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                try {
                    System.out.print("\n>> Choose action: ");
                    action = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    if (action < 1 || action > 4) {
                        System.out.println("❌ Invalid choice. Please enter a number between 1 and 4.");
                    } else {
                        validInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input. Please enter a number.");
                    scanner.nextLine();
                }
            }

            if (action == 1)      player.dealDamage(target);
            else if (action == 2) player.useSkill(target);
            else if (action == 3) player.useSpecial(target);
            else                  InventoryMenu.open(player);

            if (!target.isAlive()) {
                System.out.println("💀 " + target.name + " is defeated!\n");
                enemies.remove(targetIndex);
            }

            for (Enemy enemy : enemies) {
                if (enemy.isAlive()) enemy.dealDamage(player);
            }

            player.reduceCooldowns();
            if (!enemies.isEmpty()) player.regenerateMana();

            if (!player.isAlive()) {
                MusicPlayer.stop(); // ← ADDED

                if (currentWorld == 1) {
                    MusicPlayer.play(MusicPlayer.GAME_OVER, false);
                    System.out.println("\n☠️ You were defeated in your first mission...");
                    System.out.println("🔚 GAME OVER");
                    System.exit(0);
                }

                System.out.println("💀 You were defeated...");
                int rescueType = BeggarEvent.trigger(player, currentWorld);
                if (rescueType == 1) System.out.println("\n✨ Sir Khai has saved you for the first time!");
                if (rescueType == 2) System.out.println("\n✨ Sir Khai drags your unconscious body to safety again!!");
                if (rescueType == 0) {
                    System.out.println("\n☠️ Your journey ends here...");
                    System.out.println("🔚 Game Over");
                    return false;
                }

                MusicPlayer.play(MusicPlayer.BATTLE, true); // ← ADDED: resume after rescue
                continue;
            }
        }

        if (player.isAlive()) {
            MusicPlayer.play(MusicPlayer.WINNER, false); // ← ADDED
            System.out.println("\n                                             ┏━━━━━━━━━━━━━━━━★★★★★ QUEST COMPLETE ★★★★★━━━━━━━━━━━━━━━━┓");
            System.out.println("                                                             [🎉] " + player.name + " defeated all enemies!");
            int reward = isBossBattle ? 100 : 20;
            player.setBarya(player.getBarya() + reward);
            System.out.println("                                                             [💰] You received " + reward + " barya!");
            System.out.println("                                                             [↑] Level Up Achieved! ");
            player.levelUp();
            System.out.println("                                                             [🏦] Total barya: " + player.getBarya());
            System.out.println("                                             ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
        }
        return true;
    }
}