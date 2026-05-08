package Storyline.World2;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W2Mission4 {
    public static void w2mission4(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("======================================================================================================================================================================");
        System.out.println("░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░█░█░░░░░░░█▀█░░░█▀▀░█░█░█▀▄░▀█▀░█▀█░█▀▀░░░█▀█░█▀▀░░░█▀▀░█▀█░▀█▀░█▀▄░█▀█░▀█▀░█░░░█▀▀░░░█▀█░█▀█░█▀▄░░░█▀▄░█▀█░█▀█░█▀▀░░░░▄▀░░▄▀");
        System.out.println("░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀█░░▀░░░░█▀█░░░▀▀█░█▀█░█▀▄░░█░░█░█░█▀▀░░░█░█░█▀▀░░░█▀▀░█░█░░█░░█▀▄░█▀█░░█░░█░░░▀▀█░░░█▀█░█░█░█░█░░░█▀▄░█░█░█░█░█▀▀░░░▀▄░░▀▄░");
        System.out.println("░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░░░▀░░▀░░░░▀░▀░░░▀▀▀░▀░▀░▀░▀░▀▀▀░▀░▀░▀▀▀░░░▀▀▀░▀░░░░░▀▀▀░▀░▀░░▀░░▀░▀░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░▀░▀░▀░▀░▀▀░░░░▀▀░░▀▀▀░▀░▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("======================================================================================================================================================================");
        System.out.println();

        System.out.println("You make your way back to Andrea and the Tambalan.\nThough pale, Andrea’s eyes open the moment she hears your footsteps.");
        sc.nextLine();

        System.out.println("Andrea: You’re back. Did you find it?");
        sc.nextLine();

        System.out.println("You kneel and present the Pandai’s creation.\nAndrea’s hand trembles as she reaches for it, but the moment her fingers curl around the hilt,\nthe blade glows brightly in the darkness.");
        sc.nextLine();

        System.out.println("Tambalan: Good. The sword knows its master.\nYou must go now, but listen well. Find the Aswang’s lair by following the signs of their gluttony.\nBeware their trickery, for the farther away they sound, the closer they actually are.");
        System.out.println();
        DialogueUtils.pause();

        System.out.println("With those parting words from the Tambalan, you and Andrea make your way out to the hostile wilds of Mogul.");
        sc.nextLine();

        System.out.println("Soon enough, you feel the shift in the air.\nBeside you, Andrea raises the bolo in the air.\nIts light shimmers in the blistering darkness. You remember what the Pandai told you.");
        sc.nextLine();

        System.out.println(player.name + ": \"The blessed bolo will lead the way.\". Come on, let's get going.");
        sc.nextLine();

        System.out.println("After a few more steps, you look up to see a towering structure made of bones, sinew, and dried blood.\nAll around you, there are hundreds of these same structures, festooned with glistening entrails\nlike a perverted shrine created to worship everything unholy that ever walked this land. ");
        sc.nextLine();

        System.out.println("A sick feeling washes over you as you and Andrea come to the same conclusion- you've made it to the Aswang’s lair.");
        sc.nextLine();
        DialogueUtils.pause();
    }
}
