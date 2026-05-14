package Storyline;

import Audio.MusicPlayer;
import Display.ConsoleColors;

public class Ending {
    public static void ending() {
        MusicPlayer.play(MusicPlayer.OUTRO, false);

        System.out.println("\n\n");
        System.out.println(ConsoleColors.YELLOW + "                                                         ▄▄▄█████▓ ██░ ██ ▓█████    ▓█████  ███▄    █ ▓█████▄ ");
        System.out.println("                                                         ▓  ██▒ ▓▒▓██░ ██▒▓█   ▀    ▓█   ▀  ██ ▀█   █ ▒██▀ ██▌");
        System.out.println("                                                         ▒ ▓██░ ▒░▒██▀▀██░▒███      ▒███   ▓██  ▀█ ██▒░██   █▌");
        System.out.println("                                                         ░ ▓██▓ ░ ░▓█ ░██ ▒▓█  ▄    ▒▓█  ▄ ▓██▒  ▐▌██▒░▓█▄   ▌");
        System.out.println("                                                           ▒██▒ ░ ░▓█▒░██▓░▒████▒   ░▒████▒▒██░   ▓██░░▒████▓ ");
        System.out.println("                                                           ▒ ░░    ▒ ░░▒░▒░░ ▒░ ░   ░░ ▒░ ░░ ▒░   ▒ ▒  ▒▒▓  ▒ ");
        System.out.println("                                                             ░     ▒ ░▒░ ░ ░ ░  ░    ░ ░  ░░ ░░   ░ ▒░ ░ ▒  ▒ ");
        System.out.println("                                                           ░       ░  ░░ ░   ░         ░      ░   ░ ░  ░ ░  ░ ");
        System.out.println("                                                                   ░  ░  ░   ░  ░      ░  ░         ░    ░    " + ConsoleColors.YELLOW);
        System.out.println("\n");
        System.out.println();
        System.out.println(ConsoleColors.GREEN + "                                                      ~------~ YOUR JOURNEY HAS REACHED ITS FATEFUL END ~------~");
        System.out.println("                                                             ~------~ BUT LEGENDS NEVER TRULY DIE ~------~");
        System.out.println("                                                         ~------~ AND THE ADVENTURE ISN'T QUITE OVER ~------~" + ConsoleColors.RESET);
        System.out.println();

        DialogueUtils.pause();


    }
}
