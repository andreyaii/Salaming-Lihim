package Storyline.World2;

import Audio.MusicPlayer;
import Core.*;
import Display.ConsoleColors;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W2Mission1 {
    public static boolean mission1(PlayerCharacter player){
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println(ConsoleColors.BOLD_BLUE + "                       ====================================================WORLD 2=====================================================");
        System.out.println("                       ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀█░░░░░░░░▀█▀░█░█░█▀▀░░░█░░░█▀█░█▀▀░▀█▀░░░█░░░█▀█░█░█░█▀▀░█░█░░░░▄▀░░▄▀");
        System.out.println("                       ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░█░░░▀░░░░░█░░█▀█░█▀▀░░░█░░░█▀█░▀▀█░░█░░░░█░░░█▀█░█░█░█░█░█▀█░░░▀▄░░▀▄░");
        System.out.println("                       ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀▀▀░▀░▀░▀▀▀░░▀░░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░░░░░▀░░░▀");
        System.out.println("                       ================================================================================================================" + ConsoleColors.RESET);

        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.YELLOW + "You see Andrea heavily injured on the ground, the Bungisngis limping towards her. You rush in to protect her.\n" + ConsoleColors.RESET);
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(player,2,EnemyType.BUNGISNGIS2, 1);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 2, false);

        if (!survived) {
            return false;
        }

        player.resetCooldowns();

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Andrea: Finally, you took it down, friend." + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": Andrea, you’re heavily injured." + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.CYAN + player.name + ": We need to get you treated immediately." + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.CYAN + player.name + ": It’ll be too late if we go to the city." + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.CYAN + player.name + ": Stay conscious, I’ll find something to treat you with." + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- YOU NARRATION (YELLOW) ---
        System.out.println(ConsoleColors.YELLOW + "You lay Andrea against a small boulder and search for herbs that could treat her." + ConsoleColors.RESET);
        System.out.println();

        DialogueUtils.pause();
        return true;
    }
}