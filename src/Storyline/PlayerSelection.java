package Storyline;

import Core.*;
import Display.RaceArt;

import java.util.*;

public class PlayerSelection {
    public static PlayerCharacter createPlayer() {
        Scanner scanner = new Scanner(System.in);
        int raceChoice = -1, classChoice = -1, choice;

        String name = "";

        // Race selection
        RaceArt.displayTikbalang();
        System.out.println("\n\u001B[36m                                                                   ▌║█║▌│║▌│║▌║▌█║ 𝐓𝐢𝐤𝐛𝐚𝐥𝐚𝐧𝐠 ▌│║▌║▌│║║▌█║▌║█\u001B[0m");
        System.out.println();
        System.out.print("\u001B[33m");
        System.out.println("                             A tikbalang is a mythical, half-human, half-horse creature, known for its horse-like head and hooves, long limbs," +
                "\n                           and gifted with the ability to lead travelers astray in forests and mountains. Though often portrayed as a deceptive" +
                "\n                                                  prankster or trickster, it can also be seen as a guardian of nature.\n");
        System.out.print("\u001B[0m");

        DialogueUtils.pause();
        RaceArt.displayKapre();
        System.out.println("\n\u001B[32m                                                                   ▌║█║▌│║▌│║▌║▌█║ 𝐊𝐚𝐩𝐫𝐞 ▌│║▌║▌│║║▌█║▌║█\u001B[0m");
        System.out.println();
        System.out.print("\u001B[33m");
        System.out.println("                             A kapre is a towering, tree-dwelling mythical creature. It is a tall, hairy, and muscular giant with dark skin and" +
                "\n                         a strong smell, who enjoys smoking large cigars and getting drunk. Often portrayed as playful tricksters, they are known for " +
                "\n                           playing harmless pranks on people and causing them to get lost. Beware, though, for they can become dangerous if angered.\n");
        System.out.print("\u001B[0m");

        scanner.nextLine();
        DialogueUtils.pause();

        while (true) {
            try {
                System.out.println("                                                         ╔═════════════════════════════════════╗");
                System.out.println("                                                         ║    -- LEGENDS OF THE SHADOWED --    ║");
                System.out.println("                                                         ║          >> REALM RACES <<          ║");
                System.out.println("                                                         ╠═════════════════════════════════════╣");
                System.out.println("                                                         ║ Tikbalang   → HP 180  | Mana 140    ║");
                System.out.println("                                                         ║ Kapre       → HP 185 | Mana 155     ║");
                System.out.println("                                                         ╚═════════════════════════════════════╝");
                System.out.println("                                                                  Choose your race:");
                Map<Integer, String> races =    Race.getAvailableRaces();
                for (Map.Entry<Integer, String> entry : races.entrySet()) {
                    System.out.printf("                                                                  [%d] %s\n", entry.getKey(), entry.getValue());
                }
                System.out.print("                                                                  You've chosen: ");
                raceChoice = Integer.parseInt(scanner.nextLine());
                System.out.println();
                if (!races.containsKey(raceChoice)) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("                                                 ❌ Invalid race choice. Please enter a valid number.\n");
            }
        }

        // Name input
        while (true) {
            try {
                System.out.print("                                                           Enter your character name: ");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("                                                        ⚠️ Name cannot be empty. Try again.\n");
            }
        }
        //name confirmation (won't close loop until player is happy with the name)
        while (true) {
            System.out.println("                                                  ------------------------------------------------------");
            System.out.println("                                                     Hello, " + name + "! Are you satisfied with that name?");
            System.out.println("                                                  ------------------------------------------------------");
            System.out.println("                                                                  [1] Yes\n                                                                  [0] No, change it.");

            try {
                System.out.print("                                                                  You've chosen: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    break;
                } else if (choice == 0) {
                    System.out.println();
                    while (true) {
                        try {
                            System.out.print("                                                           Enter your character name: ");
                            name = scanner.nextLine().trim();
                            if (name.isEmpty()) throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("                                                           ⚠️ Name cannot be empty. Try again.\n");
                        }
                    }
                } else {
                    System.out.println("                                                           ⚠️ Please enter only 1 or 0.\n");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("                                                   ⚠️ Invalid input. Please enter a number (1 or 0).\n");
                scanner.nextLine();
            }
        }

        PlayerCharacter player = CharacterBuilder.build(name, raceChoice);
        player.displayStats();
        return player;
    }
}