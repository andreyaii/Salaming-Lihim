package Storyline.World3;

import Core.*;
import Storyline.DialogueUtils;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class W3Mission1 {
    public static boolean w3mission1(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("         ============================================================================================================================================");
        System.out.println("         ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀█░░░░░░░░░░█░█░█▀█░█▀█░█░█░▀█▀░█▀█░█▀▀░░░▀█▀░█░█░█▀▀░░░█▄█░█▀█░█░█░█▀█░▀█▀░█▀█░▀█▀░█▀█░░░░░░▄▀░░▄▀");
        System.out.println("         ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░█░░░▀░░░░░░█▀▄░█░█░█░█░█▄█░░█░░█░█░█░█░░░░█░░█▀█░█▀▀░░░█░█░█░█░█░█░█░█░░█░░█▀█░░█░░█░█░░░░░▀▄░░▀▄░");
        System.out.println("         ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░░░▀░▀░▀░▀░▀▀▀░▀░▀░▀▀▀░▀░▀░▀▀▀░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀▀▀░▀░▀░░▀░░▀░▀░▀▀▀░▀░▀░░░░░░░▀░░░▀");
        System.out.println("         ============================================================================================================================================");
        System.out.println();
        sc.nextLine();

        System.out.println("After persevering through Mogul's suffocating darkness for days on end, Mt. Kanatuan's gentle sunrise leaves you nearly blinded.");
        sc.nextLine();
        System.out.println("Andrea: We should search our surroundings for clues and any signs of life.");
        sc.nextLine();
        System.out.println("You and Andrea begin to cautiously follow the trail and eventually end up in a small clearing with a fallen tree in the middle.\nYou scan the area and see a small, ragged satchel beside the tree trunk. ");
        sc.nextLine();

        Item hpPotion = new Item("Health Potion", 0, "Restores HP to full", ItemType.HEALTH);
        Item manaPotion = new Item("Mana Potion", 0, "Restores Mana to full", ItemType.MANA);
        player.addItem(hpPotion);
        player.addItem(manaPotion);

        System.out.println("🧪 You found a Health Potion and a Mana Potion!");
        System.out.println();
        System.out.println("Andrea: That's a nice find!");
        sc.nextLine();
        System.out.println(player.name + ": Indeed. We should go explore the mountain some more.");
        sc.nextLine();
        System.out.println("But your blood runs cold when you're faced with tiyanaks, their sharp black teeth glinting with viscera.");
        sc.nextLine();
        System.out.println("[You have encountered 3 Tiyanaks. Please choose a target and an attack]");

        // Fixed: was incorrectly spawning Tria's henchmen here
        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.TIYANAK, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 3, false);
        if (!survived) return false;
        player.resetCooldowns();

        System.out.println("After the tedious fight with the tiyanaks, you and Andrea sit by the side of a stream to recuperate and recover your energy.");
        sc.nextLine();

        player.rest();
        DialogueUtils.pause();

        System.out.println("But after only a few minutes, your peaceful respite is interrupted by the sound of footsteps from a distance.");
        sc.nextLine();
        System.out.println("???: Over there!!! Spread out and search the area. That traitor couldn't have gone far.");
        sc.nextLine();
        System.out.println("Before they can come any closer, you and Andrea move to take cover in a secluded area behind some thick bushes.\nSimultaneously, you and Andrea still your breaths when you hear footsteps stop right in front of your hiding place.");
        sc.nextLine();
        System.out.println("???: What will we do with Kheila when we find her, Commander?");
        sc.nextLine();
        System.out.println("Commander: Don't even say that name in front of me.");
        sc.nextLine();
        System.out.println("You hear the commander seemingly spitting in disgust at the traitor they speak of.");
        sc.nextLine();
        System.out.println("Commander: Trashy lowlife sympathiser! She will be brought to her knees in front of the mistress and executed for her crimes.");
        sc.nextLine();
        System.out.println("???: Commander, we've found some tracks heading south.");
        sc.nextLine();
        System.out.println("Commander: Alright, move out. We must catch that traitor!");
        sc.nextLine();
        System.out.println("You wait for a few more minutes after they leave before getting out of your hiding place.");
        sc.nextLine();
        System.out.println("Andrea: Those were Babaylans. They said they were looking for a traitor.\nDo you think we should look for whoever that Kheila is and ask for her help?\nShe might have some information against the Babaylans.");
        sc.nextLine();
        System.out.println(player.name + ": Let's go. It's definitely worth a try.");
        sc.nextLine();
        System.out.println("You follow the tracks of deep footprints, broken branches, and streaks of blood winding down a narrow path into the lower forest.\nThe air grows dense with mist, and the once-cheerful songs of birds fade into silence.");
        sc.nextLine();
        System.out.println("After several minutes, you spot flickering lights ahead—a camp.");
        System.out.println("You crouch behind a fallen log. In the clearing, several Babaylans circle a campfire.\nBound and gagged near the flames sits a woman with matted hair and bruised wrists.");
        sc.nextLine();
        System.out.println("Andrea: That must be her… Kheila.");
        sc.nextLine();
        System.out.println("Commander: Tighten her bonds! The Mistress will be pleased once we drag this traitor back to the altar.");

        while (true) {
            try {
                System.out.println("\n                                             ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                System.out.println("                                             ┃ >> What's your approach?                                     ┃");
                System.out.println("                                             ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
                System.out.println("                                             ┃ [1] Create a distraction while Andrea frees Kheila.          ┃");
                System.out.println("                                             ┃ [2] Stealth attack the Babaylans before they notice you.     ┃");
                System.out.println("                                             ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                System.out.print("                                                              Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    System.out.println("You throw a stone to the far side of the camp. A few Babaylans turn to investigate the noise. Andrea slips through the shadows toward Kheila, cutting the ropes binding her wrists.");
                    break;
                } else if (choice == 2) {
                    System.out.println("You and Andrea move in silently, striking fast. The nearest Babaylan falls before he can even shout. Kheila's eyes widen in shock as Andrea slices through her bindings.");
                    break;
                } else {
                    System.out.println("                                                        ❌ Invalid choice. Please enter 1 or 2.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("                                                        ❌ Invalid input. Please enter 1 or 2.\n");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("                                                        ⚠️ An unexpected error occurred: " + e.getMessage());
                sc.nextLine();
            }
        }

        System.out.println("Commander: Intruders! Stop them!");
        sc.nextLine();
        System.out.println("[You encountered 2 Babaylans. Please choose a target and an attack.]");
        sc.nextLine();

        // Fixed: battle is now actually implemented instead of skipped
        List<Enemy> babaylans = EnemyFactory.spawnEnemies(EnemyType.BABAYLANS, 2);
        survived = battle.startBattle(player, babaylans, 3, false);
        if (!survived) return false;
        player.resetCooldowns();

        System.out.println("You and Andrea finish off the last of the enemies. The remaining Babaylans scatter into the forest.");
        System.out.println("You kneel beside the rescued woman. She's breathing heavily, clutching at her raw wrists.");
        sc.nextLine();
        System.out.println(player.name + ": You're safe now. You're Kheila, right?");
        sc.nextLine();
        System.out.println("Kheila: Yes, thank you for rescuing me. I was one of them.\nI helped with their rituals until I learned that they want to merge the powers of Mogul\nand the mortal world so they can make the Babaylan Mistress the ruler of Biringan City.\nI tried to warn the others, but they called me a traitor.");
        sc.nextLine();
        System.out.println(player.name + ": Tria mentioned something. A \"Babaylan's plan.\" So it's true, then?");
        sc.nextLine();
        System.out.println("Kheila: Yes, but all is not lost. I stole this from their leader before I ran away.");
        sc.nextLine();
        System.out.println("Kheila reaches into her tattered cloak and pulls out a worn, ancient scroll, its edges blackened as if burned.");
        sc.nextLine();
        System.out.println("Kheila: This contains a clue to find the Babaylan's best-kept secret--\na weapon that has the power to destroy even the strongest of them all.");

        DialogueUtils.pause();
        return true;
    }
}