package Storyline.World2;

import Audio.MusicPlayer;
import Core.*;
import Display.ConsoleColors;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W2Mission3 {
    public static boolean w2mission3(PlayerCharacter player){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        // --- WORLD TITLE CARD (RED) ---
        System.out.println(ConsoleColors.BOLD_BLUE + "                       ============================================================================================================");
        System.out.println("                       ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀█░░░░░░░▀█▀░█░█░█▀▀░░░▀█▀░█▀▄░█▀█░█▀█░░░█░█░▀█▀░█░░░█░░░░░░▄▀░░▄▀");
        System.out.println("                       ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀▄░░▀░░░░░█░░█▀█░█▀▀░░░░█░░█▀▄░█░█░█░█░░░█▄█░░█░░█░░░█░░░░░▀▄░░▀▄░");
        System.out.println("                       ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀░░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀▀▀░▀░▀░▀▀▀░▀░▀░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("                       ============================================================================================================" + ConsoleColors.RESET);

        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("The tambalan points you toward the east, where the marshland breaks into cracked stone and sunken ruins.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("At the center of it all, you see a faint glow inside a crumbling forge, fire still alive where no fire should exist.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("An old man steps out from the shadows of the forge.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Pandai: I know why you've come." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": How?" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Pandai: The flames whisper to me. They told me that the Tambalan sent you." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println(ConsoleColors.GREEN + "Pandai: He wants me to part with the weapon. But it will not be yours—or hers—without proof." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("He produces a hammer and strikes the ground with it, the sound echoing like thunder through the silent ruins.");

        // --- ENCOUNTER (YELLOW) ---
        System.out.println("From the shadows, three figures crawl forth. Viciously deformed werebeasts frothing at the mouth, their skin covered in sores that leak with pus and corrosive acid.");
        System.out.println("Their eyes gleam with hunger as they stagger closer.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Pandai: Defeat them, and prove you are worthy. Only then will the weapon be forged anew." + ConsoleColors.RESET);
        System.out.println();
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.SIGBIN, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 2, false);

        if (!survived) {
            return false;
        }

        player.resetCooldowns();
        sc.nextLine();

        // --- NARRATION (DEFAULT) ---
        System.out.println("Once the battle is won, the Pandai approaches you, impressed.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Pandai: Congratulations. You may yet survive this place." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("He disappears inside the forge and returns with a weapon as dark as Mogul, \nyet burning with an ember of the eternal flame that has blessed the Pandai.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Pandai: Here, give this to your friend. She has a will made of iron. In her hands, this bolo will find its true strength." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("You take the weapon, its weight heavy, its power undeniable.\nAndrea’s future in Mogul depends on this gift.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": Thank you." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Pandai: You and your friend proved your worth. There is no need for gratitude. Do you know where you must go next?" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": Yes. I must find the Aswang’s lair so that I can talk to their leader." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println(ConsoleColors.CYAN + player.name + ": I need to know what they plan to do with the Diwatas and Encantos they’ve had abducted." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println(ConsoleColors.CYAN + player.name + ": I must get to the bottom of this wretched scheme." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Pandai: Very good. Mogul is a place that cannot be navigated, but the tambalan can point you to the right direction," + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println(ConsoleColors.GREEN + "Pandai: and the blessed bolo will lead the way. Good luck, young hero." + ConsoleColors.RESET);
        System.out.println();

        DialogueUtils.pause();
        return true;
    }
}