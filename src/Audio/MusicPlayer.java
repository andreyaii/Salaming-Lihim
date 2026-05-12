package Audio;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class MusicPlayer {

    private static Clip clip;

    public static void play(String fileName, boolean loop) {

        try {

            // stop current music first
            if (clip != null && clip.isRunning()) {
                clip.stop();
                clip.close();
            }

            // get file from resources/audio
            URL soundURL =
                    MusicPlayer.class.getResource("/audio/" + fileName);

            // check if file exists
            if (soundURL == null) {
                System.out.println("Music file not found: " + fileName);
                return;
            }

            // load audio
            AudioInputStream audioStream =
                    AudioSystem.getAudioInputStream(soundURL);

            clip = AudioSystem.getClip();
            clip.open(audioStream);

            // loop music if true
            if (loop) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }

            // play
            clip.start();

        } catch (UnsupportedAudioFileException |
                 IOException |
                 LineUnavailableException e) {

            System.out.println("Error playing music: " + e.getMessage());
        }
    }

    public static void stop() {

        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}