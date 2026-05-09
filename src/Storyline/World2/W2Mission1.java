package Storyline.World2;

import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W2Mission1 {
    public static boolean mission1(PlayerCharacter player){
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("                       ================================================================================================================");
        System.out.println("                       ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀█░░░░░░░░▀█▀░█░█░█▀▀░░░█░░░█▀█░█▀▀░▀█▀░░░█░░░█▀█░█░█░█▀▀░█░█░░░░▄▀░░▄▀");
        System.out.println("                       ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░█░░░▀░░░░░█░░█▀█░█▀▀░░░█░░░█▀█░▀▀█░░█░░░░█░░░█▀█░█░█░█░█░█▀█░░░▀▄░░▀▄░");
        System.out.println("                       ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀▀▀░▀░▀░▀▀▀░░▀░░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░░░░░▀░░░▀");
        System.out.println("                       ================================================================================================================");

        scan.nextLine();

        System.out.println(
                "You see Andrea heavily injured on the ground, the Bungisngis limping towards her. You rush in to protect her.\n");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.BUNGISNGIS2, 1);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 2, false);

        if (!survived) {
            return false;
        }

        player.resetCooldowns();

        System.out.println("Andrea: Finally, you took it down, friend.");
        scan.nextLine();
        System.out.println(player.name + ": Andrea, you’re heavily injured.");
        scan.nextLine();
        System.out.println(player.name + ": We need to get you treated immediately.");
        scan.nextLine();
        System.out.println(player.name + ": It’ll be too late if we go to the city.");
        scan.nextLine();
        System.out.println(player.name + ": Stay conscious, I’ll find something to treat you with.");
        scan.nextLine();

        System.out.println("You lay Andrea against a small boulder and search for herbs that could treat her.");
        System.out.println();
        DialogueUtils.pause();
        return true;
    }
}
