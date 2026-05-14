package Storyline;

import Audio.MusicPlayer;
import Display.ConsoleColors;

import java.util.Scanner;

public class DialogueUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static void pause() {
        try {
            System.out.println(ConsoleColors.MAGENTA + ">> Press ENTER to continue..." + ConsoleColors.RESET);
            scanner.nextLine();

            MusicPlayer.playSFX(MusicPlayer.CLICK); /// ADD THIS LINE FOR CLICK SOUND EVERY ENTER

        } catch (Exception e) {
            System.out.println("⚠️ Input error. Skipping pause.");
        }
    }
}
