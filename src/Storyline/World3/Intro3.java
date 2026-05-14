package Storyline.World3;

import Display.ConsoleColors;
import Storyline.DialogueUtils;
import Audio.MusicPlayer;

public class Intro3 {
    public static void intro3 () {
        MusicPlayer.play(MusicPlayer.INTRO3, true);

        System.out.println(ConsoleColors.BOLD_RED + "   ╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗ ");
        System.out.println("   ║      ▲        ▲  .        ▪        .     ▲▲▲     .        ▪    .       .           ▪             .     ▪          ▪         ▲▲▲                ▲      ║ ");
        System.out.println("   ║     ▲▲▲      ▲▲▲        ▪       ▲       █████   • ▌ ▄ ·. ▄▄▄▄▄   ,   ▄ •▄  ▄▄▄·  ▐ ▄  ▄▄▄· ▄▄▄▄▄▄• ▄▌ ▄▄▄·  ▐ ▄      ▲     █████     ▪        ▲▲▲     ║");
        System.out.println("   ║    ▲▲▲▲▲    █████    ▲    .    ▲▲▲              ·██ ▐███▪•██     ▪   █▌▄▌▪▐█ ▀█ •█▌▐█▐█ ▀█ •██  █▪██▌▐█ ▀█ •█▌▐█ .  ▲▲▲            ▲         ▲▲▲▲▲    ║");
        System.out.println("   ║  ▲▲▲▲▲▲▲▲▲     ▪    ▲▲▲       █████     ▪   .   ▐█ ▌▐▌▐█· ▐█.▪       ▐▀▀▄·▄█▀▀█ ▐█▐▐▌▄█▀▀█  ▐█.▪█▌▐█▌▄█▀▀█ ▐█▐▐▌   █████  ▪       ▲▲▲   ▪  ▲▲▲▲▲▲▲▲   ║");
        System.out.println("   ║      █      .  '   █████  '  . .         ▲      ██ ██▌▐█▌ ▐█▌·       ▐█.█▌▐█ ▪▐▌██▐█▌▐█ ▪▐▌ ▐█▌·▐█▄█▌▐█ ▪▐▌██▐█▌'   .   '  .  '  █████         █      ║");
        System.out.println("   ║    █████     ▪               ▲         ▲▲▲     ▀▀  █▪▀▀▀ ▀▀▀  ▀ ▲    ·▀  ▀ ▀  ▀ ▀▀ █▪ ▀  ▀  ▀▀▀  ▀▀▀  ▀  ▀ ▀▀ █▪         ▲            ▪      █████    ║");
        System.out.println("   ║  █████████      ▲     . ▪   ▲▲▲       █████    .  ▲      .   ▪ ▲▲▲         ▪      .      ▲        ▪            ▲    ▪   ▲▲▲  .    ▲     ▪  █████████  ║ ");
        System.out.println("   ╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝ " + ConsoleColors.RESET);

        DialogueUtils.pause();
    }
}
