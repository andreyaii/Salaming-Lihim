package Storyline.World1;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W1Mission2 {
    public static boolean helpedBeggar = false;

    public static void w1mission2(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("            ===================================================================================================================================");
        System.out.println(
                "            ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀▄░░░░░░░█▀█░░░▄▀▄░░█░█░█▀▀░█▀▀░▀█▀░▀█▀░█▀█░█▀█░░░█▀█░█▀▀░░░█░█░█▀█░█▀█░█▀█░█▀▄░░░░▄▀░░▄▀\n"
                        +"            ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░▄▀░░░▀░░░░█▀█░░░█\\█░░█░█░█▀▀░▀▀█░░█░░░█░░█░█░█░█░░░█░█░█▀▀░░░█▀█░█░█░█░█░█░█░█▀▄░░░▀▄░░▀▄\n"
                        +"            ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░▀░▀░░░░▀\\░░▀▀▀░▀▀▀░▀▀▀░░▀░░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░▀░░░░░▀░▀░▀▀▀░▀░▀░▀▀▀░▀░▀░░░░░▀░░░▀"
        );
        System.out.println("            ===================================================================================================================================");

        scan.nextLine();

        System.out.println("After your encounter with Sean, your spirits are high.");
        System.out.println("But as you round the corner, you see a man sprawled in a heap on the floor, seemingly down on his luck.");
        System.out.println("You wrinkle your nose as the stains and the stench of the grimy streets have seemingly merged with the tattered clothing the man wears.");
        System.out.println("His head whips toward you the moment you walk by, and he holds out an open palm.");
        DialogueUtils.pause();

        System.out.println("Beggar: Please, kind stranger, do you have any barya to spare? I have been sick for days, but I do not have the twenty barya needed to pay for medicine.");
        scan.nextLine();

        System.out.println("The man starts coughing halfway through his last sentence, and you fight the urge to say yes to him immediately, for you only have " + player.getBarya() + "barya");
        System.out.println("to your name. But you know that if you do not help him, no one else will.");
        scan.nextLine();

        //beggar dialogue not implemented yet



        System.out.println("\nInside the Information Guild, the air hums and shelves groan under the weight of ancient scrolls. Watchful slitted eyes follow you as you step forward.");
        System.out.println("An elderly Tamawo scribe greets you. And though you can see the centuries evident in the lines of his face, you still have to fight the disarming ");
        System.out.println("allure of his pale, handsome face and sparkling skin.");
        scan.nextLine();
        System.out.println("Scribe: You must have travelled far just to find our humble guild. Tell me, what knowledge do you seek?");
        scan.nextLine();
        System.out.println(player.name + ": I am investigating the cases of Diwatas and Encantos going missing lately. My friend Sean told me that you would be able to offer ");
        System.out.println("me more information about that.");
        scan.nextLine();
        System.out.println("Scribe: Our informants speak of Bungisngis prowling the outskirts. They work with tiyanaks who drag Enkantos and Diwatas into the Dark Forest, ");
        System.out.println("where they are carted off like mere cattle and brought to the land of the Aswangs.");
        scan.nextLine();

        System.out.println("He presses a worn map into your hand, the edges trembling faintly as though the parchment itself feared what it depicted.");
        scan.nextLine();
        System.out.println("Scribe: If you truly wish to stand against them, then steel yourself. It is not named the Dark Forest for no reason.");
        scan.nextLine();
        System.out.println("Scribe: The forest is alive. And it does not forgive trespassers easily.");
        scan.nextLine();
        System.out.println("The chamber grows colder as the candles flicker low.");
        System.out.println("Outside, the wind howls, carrying with it faint echoes of booming laughter.");
        System.out.println();
        System.out.println("Your next step is clear. The Dark Forest awaits.");
        DialogueUtils.pause();
    }
}
