package Storyline.World1;

import Audio.MusicPlayer;
import Core.*;
import Display.ConsoleColors;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W1Mission1 {
    // ANSI color codes

    public static boolean mission1(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println(ConsoleColors.BOLD_BLUE + "              ================================================================================================================================");
        System.out.println("              ░░░▀▄░░▀▄░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀█░░░░░░░░▀█▀░█░█░█▀▀░░░█░█░█▀▀░█▀█░█▀▄░▀█▀░░░█▀█░█▀▀░░░█▀█░░░█░█░█▀▀░█▀▄░█▀█░░░░▄▀░░▄▀");
        System.out.println("              ░░░░▄▀░░▄▀░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░█░░░▀░░░░░█░░█▀█░█▀▀░░░█▀█░█▀▀░█▀█░█▀▄░░█░░░░█░█░█▀▀░░░█▀█░░░█▀█░█▀▀░█▀▄░█░█░░░▀▄░░▀▄░");
        System.out.println("              ░░░▀░░░▀░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀░▀░▀░▀░░▀░░░░▀▀▀░▀░░░░░▀░▀░░░▀░▀░▀▀▀░▀░▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("              ================================================================================================================================\n" + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println(ConsoleColors.GREEN + "???: Someone help! Please! A thief has stolen my merchandise!" + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.print("You find the source of the scream and, without even taking a second to think about it, you bolt after five duwendes clearly trying to make a run for it.\n");
        scan.nextLine();

        // Encounter message in yellow
        System.out.println(ConsoleColors.YELLOW + "[You encountered 3 duwendes. Choose a target and an attack]" + ConsoleColors.RESET);
        System.out.println();
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.DUWENDE, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 1, false);

        if (!survived) return false;

        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        player.resetCooldowns();

        System.out.println(ConsoleColors.GREEN + "\n\nSean: Thank you so much. I owe you my livelihood. Tell me, what would you like in return?" + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // Player dialogue in cyan
        System.out.print(ConsoleColors.CYAN + player.name + ": I'm actually investigating a bunch of disappearances around the city. Do you know anything about that?\n" + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Sean: Well, the word on the street is that some sort of giant is kidnapping Enkantos and Diwatas. If you want to know more, you might want to\n" +
                "       head to the Information Guild. My name is Sean. Tell them I sent you."+ ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("You agree and go on your way.");
        System.out.println("After a while, you see a cozy bench and decide to take a rest.");
        System.out.println();
        player.rest();
        DialogueUtils.pause();
        return true;
    }
}
