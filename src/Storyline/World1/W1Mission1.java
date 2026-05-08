package Storyline.World1;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W1Mission1 {
    public static void mission1(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("              ================================================================================================================================");
        System.out.println("              ░░░▀▄░░▀▄░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀█░░░░░░░░▀█▀░█░█░█▀▀░░░█░█░█▀▀░█▀█░█▀▄░▀█▀░░░█▀█░█▀▀░░░█▀█░░░█░█░█▀▀░█▀▄░█▀█░░░░▄▀░░▄▀");
        System.out.println("              ░░░░▄▀░░▄▀░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░█░░░▀░░░░░█░░█▀█░█▀▀░░░█▀█░█▀▀░█▀█░█▀▄░░█░░░░█░█░█▀▀░░░█▀█░░░█▀█░█▀▀░█▀▄░█░█░░░▀▄░░▀▄░");
        System.out.println("              ░░░▀░░░▀░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀░▀░▀░▀░░▀░░░░▀▀▀░▀░░░░░▀░▀░░░▀░▀░▀▀▀░▀░▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("              ================================================================================================================================\n");
        scan.nextLine();
        System.out.println("???: Someone help! Please! A thief has stolen my merchandise!");
        scan.nextLine();

        System.out.println("You find the source of the scream and, without even taking a second to think about it, you bolt after five duwendes clearly trying to make a run for it.\n");
        scan.nextLine();

        System.out.println("[You encountered 3 duwendes. Choose a target and an attack]");
        System.out.println();
        DialogueUtils.pause();

        //fight not implemented yet

        System.out.println("\n\nSean: Thank you so much. I owe you my livelihood. Tell me, what would you like in return?");
        scan.nextLine();

        System.out.print(player.name + ": I’m actually investigating a bunch of disappearances around the city. Do you know anything about that?\n");
        scan.nextLine();

        System.out.println("Sean: Well, the word on the street is that some sort of giant is kidnapping Enkantos and Diwatas. If you want to know more, you might want to\n" +
                "       head to the Information Guild. My name is Sean. Tell them I sent you.");
        scan.nextLine();

        System.out.println("You agree and go on your way.");
        System.out.println("After a while, you see a cozy bench and decide to take a rest.");
        System.out.println();
        player.rest();
        DialogueUtils.pause();
    }
}
