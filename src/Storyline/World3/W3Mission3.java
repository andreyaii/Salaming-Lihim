package Storyline.World3;

import Audio.MusicPlayer;
import Core.*;
import Display.ConsoleColors;
import Storyline.DialogueUtils;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class W3Mission3 {
    public static void w3mission5(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println();
        // --- WORLD TITLE CARD (RED) ---
        System.out.println(ConsoleColors.BOLD_BLUE + "             ==================================================================================================================================");
        System.out.println("             ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀█░░░░░░░▀█▀░█░█░█▀▀░░░█▄█░█▀█░▀▀█░█▀▀░░░█▀█░█▀▀░░░█▀▀░█▀▀░█░░░▀█▀░█▀█░█▀▀░█▀▀░░░░▄▀░░▄▀");
        System.out.println("             ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀▄░░▀░░░░░█░░█▀█░█▀▀░░░█░█░█▀█░▄▀░░█▀▀░░░█░█░█▀▀░░░█▀▀░█░░░█░░░░█░░█▀▀░▀▀█░█▀▀░░░▀▄░░▀▄░");
        System.out.println("             ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀░░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀░▀░▀▀▀░▀▀▀░░░▀▀▀░▀░░░░░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░░░▀▀▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("             ==================================================================================================================================" + ConsoleColors.RESET);
        System.out.println();
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("Slowly, you descend the stairs, and as you step through the threshold, the world falls silent.\n" +
                "The air grows cold, thick with the scent of damp soil and iron. The walls are made of the twisting roots of the Balete Tree,\n" +
                "pulsing faintly like veins running through a living entity.");
        System.out.println("You press forward. Every corridor bends in strange, impossible ways. Paths you’ve taken seem to vanish \n" +
                "behind you and bulging ancient eyes open from their slumber as you pass.You realize something as the walls close\n" +
                "in around you: this place means to swallow you whole.\n");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("At the heart of the maze stands a massive stone door carved with lunar sigils.\n" +
                "A ghostly figure materializes before you. The White Lady of Balete Drive, her form both sorrowful and radiant.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "White Lady: So you have come for the Blade’s final purpose, but every light demands a shadow." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": We’ve come this far. Tell us what must be done." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "White Lady: The door only opens to one who understands sacrifice, you must surrender half of what sustains you. Either your life-force or the moon-forged mana that fuels your power." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("Kheila’s voice trembles.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Kheila: Half? That’s– that’s irreversible." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "White Lady: Strength and magic shape every path you have walked. Choose which burden you will lighten, and which wound you will carry forward." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- CHOICE BOX (YELLOW) ---
        System.out.println("\n" + ConsoleColors.YELLOW + "                                             ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("                                             ┃ >> A heavy price must be paid:                                   ┃");
        System.out.println("                                             ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("                                             ┃ [1] Sacrifice half of your current hp. Your vitality withers.    ┃");
        System.out.println("                                             ┃ [2] Sacrifice half of your current mana. Your magical core dims. ┃");
        System.out.println("                                             ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛" + ConsoleColors.RESET);
        System.out.println();

        while (true){
            try {
                System.out.print(ConsoleColors.MAGENTA + "                                                              Enter your choice: " + ConsoleColors.RESET);
                choice = sc.nextInt();
                MusicPlayer.playSFX(MusicPlayer.CLICK);
                if (choice == 1) {
                    player.setHp(player.getHp() / 2);
                    player.boostSpecialPower(20);
                    System.out.println(ConsoleColors.GREEN + "White Lady: Your life-force narrows to a fragile thread… yet the moon often favors the desperate." + ConsoleColors.RESET);
                    break;
                } else if (choice == 2) {
                    player.setMana(player.getMana() / 2);
                    player.boostSpecialPower(20);
                    System.out.println(ConsoleColors.GREEN + "White Lady: Power wanes, but resolve sharpens. The moon tests those who rely not on spells, but on will." + ConsoleColors.RESET);
                    break;
                } else {
                    System.out.println(ConsoleColors.RED + "                                                        ❌ Invalid choice. Please enter 1 or 2.\n" + ConsoleColors.RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(ConsoleColors.RED + "                                                         ❌ Invalid input. Please enter 1 or 2.\n" + ConsoleColors.RESET);
                sc.nextLine();
                MusicPlayer.playSFX(MusicPlayer.CLICK);
            } catch (Exception e) {
                System.out.println(ConsoleColors.RED + "                                                         ⚠️ An unexpected error occurred: " + e.getMessage() + ConsoleColors.RESET);
                sc.nextLine();
                MusicPlayer.playSFX(MusicPlayer.CLICK);
            }
        }

        System.out.println();
        // --- NARRATION (DEFAULT) ---
        System.out.println("The Blade of Bulan glows, absorbing the essence of what was sacrificed and locking it into its lunar steel.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "White Lady: You have chosen well. The Blade now mirrors your truth. Go, bearer of the moon’s will." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("With those parting words, the White Lady disappears, taking every ounce of light with her.");

        DialogueUtils.pause();
    }
}