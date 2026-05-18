package Storyline.World2;

//import Core.*;
import Audio.MusicPlayer;
import Display.ConsoleColors;
import Display.DisplayUtils;
import Storyline.DialogueUtils;


public class Intro2 {
    public static void intro2(){

        MusicPlayer.play(MusicPlayer.INTRO2, true);

        System.out.println();
        System.out.println(ConsoleColors.BOLD_RED + "   ╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗ ");
        System.out.println("   ║                                                                                                                                                       ║ ");
        System.out.println("   ║                                                     ▄▀▀▄ ▄▀▄  ▄▀▀▀▀▄   ▄▀▀▀▀▄   ▄▀▀▄ ▄▀▀▄  ▄▀▀▀▀▄                                                     ║");
        System.out.println("   ║                  (  .      )                       █  █ ▀  █ █      █ █        █   █    █ █    █                  (  .      )                         ║");
        System.out.println("   ║            )           (         ,                 ▐  █    █ █      █ █    ▀▄▄ ▐  █    █  ▐    █                           )           (              ║");
        System.out.println("   ║             .  '   .   '  .  '  .                     █    █  ▀▄    ▄▀ █     █ █  █    █       █                 .  '   .   '  .  '  .                ║");
        System.out.println("   ║         (    , )       (.   )  (                    ▄▀   ▄▀     ▀▀▀▀   ▐▀▄▄▄▄▀ ▐   ▀▄▄▄▄▀    ▄▀▄▄▄▄▄▄▀       (    , )       (.   )  (                 ║");
        System.out.println("   ║       .' ) ( . )    ,') '. )  , ( .                █    █             ▐                     █                   .' ) ( . )    ,') '. )  , ( .         ║");
        System.out.println("   ║    ). , ( .   (  ) ( , ')  .' (  ,    )           ▐    ▐                                   ▐                  ). , ( .   (  ) ( , ')  .' (  ,    )    ║");
        System.out.println("   ║  (_,) . ), ) _) _,')  (, ) '. )  ,. (' )                  >> The land of death and decay. <<                 (_,) . ), ) _) _,')  (, ) '. )  ,. (' )  ║ ");
        System.out.println("   ╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝ " + ConsoleColors.RESET);

        DialogueUtils.pause();
        DisplayUtils.type("The moment you cross the threshold to Mogul, a suffocating weight settles into your chest.", 15);
        DisplayUtils.type("Here, the air is thick with the copper sting of blood. Each breath tastes of rust and rot.", 15);
        DisplayUtils.type("Beneath your feet, the ground is nothing but ashen dust, crumbling like brittle bone with every step.\n", 15);

        DisplayUtils.type("The sky is an eternal shroud, alive with twisting shapes that churn behind clouds as black as coal.", 15);
        DisplayUtils.type("Now and then, the heavens expose the outlines of crow-shaped Abwak in the distance and even some", 15);
        DisplayUtils.type("Manananggal with their entrails hanging below them like a perverted bridal train.", 15);
        DisplayUtils.type("Your eyes search your immediate surroundings for a trace of the Bungisngis and Andrea.", 15);
        DisplayUtils.type("Sensing a gust of wind, you move to follow the direction from which it came.", 15);

        DialogueUtils.pause();

    }
}
