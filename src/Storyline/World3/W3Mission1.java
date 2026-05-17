package Storyline.World3;

import Audio.MusicPlayer;
import Core.*;
import Display.ConsoleColors;
import Storyline.DialogueUtils;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class W3Mission1 {
    public static boolean w3mission1(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        // --- WORLD TITLE CARD (RED) ---
        System.out.println(ConsoleColors.BOLD_BLUE + "         =================================================================WORLD 3=======================================================================");
        System.out.println("         ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀█░░░░░░░░░░█░█░█▀█░█▀█░█░█░▀█▀░█▀█░█▀▀░░░▀█▀░█░█░█▀▀░░░█▄█░█▀█░█░█░█▀█░▀█▀░█▀█░▀█▀░█▀█░░░░░░▄▀░░▄▀");
        System.out.println("         ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░█░░░▀░░░░░░█▀▄░█░█░█░█░█▄█░░█░░█░█░█░█░░░░█░░█▀█░█▀▀░░░█░█░█░█░█░█░█░█░░█░░█▀█░░█░░█░█░░░░░▀▄░░▀▄░");
        System.out.println("         ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░░░▀░▀░▀░▀░▀▀▀░▀░▀░▀▀▀░▀░▀░▀▀▀░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀▀▀░▀░▀░░▀░░▀░▀░▀▀▀░▀░▀░░░░░░░▀░░░▀");
        System.out.println("         ============================================================================================================================================" + ConsoleColors.RESET);
        System.out.println();
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("After persevering through Mogul's suffocating darkness for days on end, Mt. Kanatuan's gentle sunrise leaves you nearly blinded.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Andrea: We should search our surroundings for clues and any signs of life." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("You and Andrea begin to cautiously follow the trail and eventually end up in a small clearing with a fallen tree in the middle.\nYou scan the area and see a small, ragged satchel beside the tree trunk. ");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        Item hpPotion = new Item("Health Potion", 0, "Restores HP to full", ItemType.HEALTH);
        Item manaPotion = new Item("Mana Potion", 0, "Restores Mana to full", ItemType.MANA);
        player.addItem(hpPotion);
        player.addItem(manaPotion);

        // --- ITEM FOUND (YELLOW) ---
        System.out.println(ConsoleColors.YELLOW + "🧪 You found a Health Potion and a Mana Potion!" + ConsoleColors.RESET);
        System.out.println();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Andrea: That's a nice find!" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": Indeed. We should go explore the mountain some more." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("But your blood runs cold when you're faced with tiyanaks, their sharp black teeth glinting with viscera.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ENCOUNTER (YELLOW) ---
        System.out.println(ConsoleColors.YELLOW + "[You have encountered 3 Tiyanaks. Please choose a target and an attack]" + ConsoleColors.RESET);

        List<Enemy> enemies = EnemyFactory.spawnEnemies(player,EnemyType.TIYANAK, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 3, false);
        if (!survived) return false;
        player.resetCooldowns();

        System.out.println("After the tedious fight with the tiyanaks, you and Andrea sit by the side of a stream to recuperate and recover your energy.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        player.rest();
        DialogueUtils.pause();

        System.out.println("But after only a few minutes, your peaceful respite is interrupted by the sound of footsteps from a distance.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.RED + "???: Over there!!! Spread out and search the area. That traitor couldn't have gone far." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("Before they can come any closer, you and Andrea move to take cover in a secluded area behind some thick bushes.\nSimultaneously, you and Andrea still your breaths when you hear footsteps stop right in front of your hiding place.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.RED + "???: What will we do with Kheila when we find her, Commander?" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.RED + "Commander: Don't even say that name in front of me." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("You hear the commander seemingly spitting in disgust at the traitor they speak of.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.RED + "Commander: Trashy lowlife sympathiser! She will be brought to her knees in front of the mistress and executed for her crimes." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.RED + "???: Commander, we've found some tracks heading south." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.RED + "Commander: Alright, move out. We must catch that traitor!" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("You wait for a few more minutes after they leave before getting out of your hiding place.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Andrea: Those were Babaylans. They said they were looking for a traitor. Do you think we should look for whoever that Kheila is and ask for her help?\nShe might have some information against the Babaylans." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.CYAN + player.name + ": Let's go. It's definitely worth a try." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("You follow the tracks of deep footprints, broken branches, and streaks of blood winding down a narrow path into the lower forest.\nThe air grows dense with mist, and the once-cheerful songs of birds fade into silence.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("After several minutes, you spot flickering lights ahead—a camp.");
        System.out.println("You crouch behind a fallen log. In the clearing, several Babaylans circle a campfire.\nBound and gagged near the flames sits a woman with matted hair and bruised wrists.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Andrea: That must be her… Kheila." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.RED + "Commander: Tighten her bonds! The Mistress will be pleased once we drag this traitor back to the altar." + ConsoleColors.RESET);

        while (true) {
            try {
                // --- SYSTEM CHOICE BOX (YELLOW) ---
                System.out.println("\n" + ConsoleColors.YELLOW + "                                             ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                System.out.println("                                             ┃ >> What's your approach?                                     ┃");
                System.out.println("                                             ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
                System.out.println("                                             ┃ [1] Create a distraction while Andrea frees Kheila.          ┃");
                System.out.println("                                             ┃ [2] Stealth attack the Babaylans before they notice you.     ┃");
                System.out.println("                                             ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛" + ConsoleColors.RESET);
                System.out.print(ConsoleColors.MAGENTA + "                                                              Enter your choice: " + ConsoleColors.RESET);

                int choice = sc.nextInt();
                sc.nextLine();
                MusicPlayer.playSFX(MusicPlayer.CLICK);

                if (choice == 1) {
                    System.out.println("You throw a stone to the far side of the camp. A few Babaylans turn to investigate the noise. Andrea slips through the shadows toward Kheila, cutting the ropes binding her wrists.");
                    break;
                } else if (choice == 2) {
                    System.out.println("You and Andrea move in silently, striking fast. The nearest Babaylan falls before he can even shout. Kheila's eyes widen in shock as Andrea slices through her bindings.");
                    break;
                } else {
                    System.out.println(ConsoleColors.RED + "                                                        ❌ Invalid choice. Please enter 1 or 2.\n" + ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(ConsoleColors.RED + "                                                        ❌ Invalid input. Please enter 1 or 2.\n" + ConsoleColors.RESET);
                sc.nextLine();
                MusicPlayer.playSFX(MusicPlayer.CLICK);
            } catch (Exception e) {
                System.out.println(ConsoleColors.RED + "                                                        ⚠️ An unexpected error occurred: " + e.getMessage() + ConsoleColors.RESET);
                sc.nextLine();
                MusicPlayer.playSFX(MusicPlayer.CLICK);
            }
        }

        System.out.println(ConsoleColors.RED + "Commander: Intruders! Stop them!" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ENCOUNTER (YELLOW) ---
        System.out.println(ConsoleColors.YELLOW + "[You encountered 2 Babaylans. Please choose a target and an attack.]" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        List<Enemy> babaylans = EnemyFactory.spawnEnemies(player,EnemyType.BABAYLANS, 2);
        BattleManager battle2 = new BattleManager();
        boolean babaylanSurvived = battle2.startBattle(player, babaylans, 3, false);
        if (!babaylanSurvived) return false;
        player.resetCooldowns();

        System.out.println("You and Andrea finish off the last of the enemies. The remaining Babaylans scatter into the forest.");
        System.out.println("You kneel beside the rescued woman. She's breathing heavily, clutching at her raw wrists.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.CYAN + player.name + ": You're safe now. You're Kheila, right?" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Kheila: Yes, thank you for rescuing me. I was one of them. I helped with their rituals until I learned that they want to merge the powers of Mogul\nand the mortal world so they can make the Babaylan Mistress the ruler of Biringan City. I tried to warn the others, but they called me a traitor." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.CYAN + player.name + ": Tria mentioned something. A \"Babaylan's plan.\" So it's true, then?" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Kheila: Yes, but all is not lost. I stole this from their leader before I ran away." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("Kheila reaches into her tattered cloak and pulls out a worn, ancient scroll, its edges blackened as if burned.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Kheila: This contains a clue to find the Babaylan's best-kept secret--a weapon that has the power to destroy even the strongest of them all." + ConsoleColors.RESET);

        DialogueUtils.pause();
        return true;
    }
}