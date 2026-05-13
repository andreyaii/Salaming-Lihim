package Storyline;

import Audio.MusicPlayer;
import java.util.Scanner;

public class DialogueUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static void pause() {
        try {
            System.out.println(">> Press ENTER to continue...");
            scanner.nextLine();

            MusicPlayer.playSFX(MusicPlayer.CLICK); /// ADD THIS LINE FOR CLICK SOUND EVERY ENTER

        } catch (Exception e) {
            System.out.println("⚠️ Input error. Skipping pause.");
        }
    }
}
