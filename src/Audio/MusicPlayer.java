package Audio;

import javax.sound.sampled.*;
import java.io.InputStream;

public class MusicPlayer {

    private static Clip currentClip;
    private static String currentTrack = "";

    // ── Track name constants ──────────────────────────────────────
    public static final String INTRO        = "Background - Intro.wav";
    public static final String ADVENTURE    = "Background - Adventure.wav";
    public static final String BATTLE_BEGIN = "Background - Battle Begins.wav";
    public static final String BATTLE       = "Background - Battle.wav";
    public static final String SHOP         = "Background - Shop.wav";
    public static final String PURCHASE     = "Background - Purchase.wav";
    public static final String CLICK        = "Background - Click.wav";
    public static final String WINNER       = "Background - Winner.wav";
    public static final String OUTRO        = "Background - Outro.wav";
    public static final String SFX_TRANSCEND    = "SFX - Transcend.wav";
    public static final String SFX_TRIPLE_STAB  = "SFX - Triple Stab.wav";
    public static final String SFX_HOOF_CHARGE  = "SFX - Hoof Charge.wav";
    public static final String SFX_CINDER_BLAST = "SFX - Cinder Blast.wav";
    public static final String SFX_KAPRE_ATTACK = "SFX - Kapre Attack.wav";
    public static final String SFX_SMOKE_CLOUD  = "SFX - Smoke Cloud.wav";
    public static final String INTRO2 = "Background - Intro 2.wav";
    public static final String INTRO3 = "Background - Intro 3.wav";
    public static final String GAME_OVER = "Background - Defeat - Game Over.wav";
    public static final String SFX_HEAL = "SFX - HEAL.wav";
    public static final String SFX_MANA = "SFX - MANA.wav";
    public static final String SFX_DUWENDE = "SFX - Goblin Throw.wav";
    public static final String SFX_DUWENDE_DEATH = "SFX - Duwende Death.wav";
    public static final String SFX_TIYANAK = "SFX - Creepy Baby Monster.wav";
    public static final String SFX_BUNGISNGIS = "SFX - Ogre Smash.wav";
    public static final String SFX_ASWANG = "SFX - Vampire Claw Attack.wav";
    public static final String SFX_SIGBIN = "SFX - Hellhound Bite.wav";
    public static final String SFX_TIKTIK = "SFX - Tongue Lash Monster.wav";
    public static final String SFX_ABWAK = "SFX - Crow Monster Screech.wav";
    public static final String SFX_BABAYLAN = "SFX - Dark Spell Cast.wav";
    public static final String SFX_HUMAN = "SFX - Gunshot.wav";
    public static final String SFX_TRIA = "SFX - Knife Throw.wav";
    public static final String SFX_ERIKA = "SFX - Dark Queen Boss Attack.wav";
    // ─────────────────────────────────────────────────────────────

    /**
     * Play a track.
     * @param filename  one of the constants above
     * @param loop      true = loop forever, false = play once
     */
    public static void play(String filename, boolean loop) {
        // Guard: don't restart the same looping track
        if (filename.equals(currentTrack) && currentClip != null && currentClip.isRunning()) {
            return;
        }

        stop(); // stop whatever was playing

        try {
            InputStream in = MusicPlayer.class.getResourceAsStream("/audio/" + filename);
            if (in == null) {
                System.out.println("[MusicPlayer] File not found: " + filename);
                return;
            }
            AudioInputStream ais = AudioSystem.getAudioInputStream(in);
            currentClip = AudioSystem.getClip();
            currentClip.open(ais);

            if (loop) {
                currentClip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                currentClip.start();
            }

            currentTrack = filename;

        } catch (Exception e) {
            System.out.println("[MusicPlayer] Could not play: " + filename + " — " + e.getMessage());
        }
    }

    public static void playSFX(String filename) {

        try {

            InputStream in =
                    MusicPlayer.class.getResourceAsStream("/audio/" + filename);

            if (in == null) {
                System.out.println("[MusicPlayer] SFX file not found: " + filename);
                return;
            }

            AudioInputStream ais =
                    AudioSystem.getAudioInputStream(in);

            Clip sfxClip = AudioSystem.getClip();
            sfxClip.open(ais);

            sfxClip.start();

        } catch (Exception e) {

            System.out.println("[MusicPlayer] Could not play SFX: "
                    + filename + " — " + e.getMessage());
        }
    }

    /** Stop and clear whatever is currently playing. */
    public static void stop() {
        if (currentClip != null) {
            currentClip.stop();
            currentClip.close();
            currentClip = null;
        }
        currentTrack = "";
    }
}