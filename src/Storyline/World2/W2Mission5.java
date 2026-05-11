package Storyline.World2;

import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W2Mission5 {
    public static boolean w2mission5(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("    ======================================================================================================================================================");
        System.out.println("    ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░█▀▀░░░░░░░░░▀█▀░█░█░█▀▀░░░█▄█░█▀█░█▀█░█▀▀░▀█▀░█▀▀░█▀▄░▀░█▀▀░░░█▀▀░█▀█░█▀█░▀█▀░█▀█░█▀▀░░░█▄█░█▀█░█░█░░░░▄▀░░▄▀");
        System.out.println("    ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░▀▀▄░░▀░░░░░░░█░░█▀█░█▀▀░░░█░█░█░█░█░█░▀▀█░░█░░█▀▀░█▀▄░░░▀▀█░░░█░█░█▀█░█▀▀░░█░░█░█░█░█░░░█░█░█▀█░█▄█░░░▀▄░░▀▄░");
        System.out.println("    ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀░░░▀░░░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀░▀░▀▀▀░░▀░░▀▀▀░▀░▀░░░▀▀▀░░░▀▀▀░▀░▀░▀░░░▀▀▀░▀░▀░▀▀▀░░░▀░▀░▀░▀░▀░▀░░░░░▀░░░▀");
        System.out.println("    ======================================================================================================================================================");
        System.out.println();

        System.out.println("The chamber opens wide before you like a cavernous maw, a cathedral of decay..");
        sc.nextLine();

        System.out.println("Hanging from the ceiling are pulsating cocoons of flesh that drip thick ichor onto the floor.\nThe air hums faintly, a constant low buzzing that seems to come from everywhere and nowhere.");
        sc.nextLine();

        System.out.println("And then… a voice.\nSmooth at first, but sickly sweet.\nThe kind of tone that curls around your spine like a whisper from a nightmare.");
        sc.nextLine();

        System.out.println("???: Have you come to be my supper? Quite idiotic of you… But well, I don’t mind.");
        sc.nextLine();

        System.out.println("The voice is followed by a wet, insectoid chitter and a soft, mocking laugh.");
        sc.nextLine();

        System.out.println("Andrea raises her glowing blade in the direction of the voice, and you feel your pulse skyrocket at the sight of the creature before you.");
        sc.nextLine();

        System.out.println("Before you is a gigantic wasp-like creature with a beautiful woman’s face.\nHer lower body writhes with veined wings and a stinger that glows faintly red.\nHer smile widens unnaturally as she leans forward, her mandibles clicking.");
        sc.nextLine();

        System.out.println(player.name + ": Who are you? Are you the leader of the Aswangs?");
        sc.nextLine();

        System.out.println("???: You don’t know who I am? Truly an idiot.");
        sc.nextLine();

        System.out.println(player.name + ": Am I supposed to?");
        sc.nextLine();

        System.out.println("???: I am Tria, the Master of Mogul! I am feared in these lands! And you, my dear, you should be terrified. Henchmen! Tear them apart!");
        sc.nextLine();

        System.out.println("From the shadows of the chamber, shapes crawl and emerge. Seven of Tria’s minions, made up of different Aswang species, respond to their leader’s command.");
        sc.nextLine();

        System.out.println("[You encountered 6 henchmen of Tria. 2 Tiktiks, 2 Abwak, 2 Aswang. Choose a target and an attack]\n{Boss cannot be chosen until henchmen are wiped out}\n");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.TIKTIK, 2);
        List<Enemy> enemies2 = EnemyFactory.spawnEnemies(EnemyType.ABWAK, 2);
        List<Enemy> enemies3 = EnemyFactory.spawnEnemies(EnemyType.ASWANG, 2);
        List<Enemy> bosses = EnemyFactory.spawnBosses(EnemyType.TRIA, 1);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 2, false);
        if (!survived) {
            return false;
        }

        survived = battle.startBattle(player, enemies2, 2, false);

        if (!survived) {
            return false;
        }
        survived = battle.startBattle(player, enemies3, 2, false);

        if (!survived) {
            return false;
        }

        System.out.println("Hah! You're quite capable. But you do not hold even a candle to my strength.");
        sc.nextLine();
        System.out.println("[You are facing Tria, the Master of Mogul. Choose an attack]");
        survived = battle.startBattle(player, bosses, 2, true);
        if (!survived) {
            return false;
        }

        player.resetCooldowns();
        sc.nextLine();


        System.out.println("Tria: I… lost? I… I can’t believe you defeated me… But you… You won’t get far. The Babaylan’s plan is already halfway.");
        sc.nextLine();

        System.out.println(player.name + ": The Babaylan? What are you talking about?");
        sc.nextLine();

        System.out.println("Leaving you with more questions, Tria draws her last breath.");
        sc.nextLine();

        System.out.println("You ponder upon the clue Tria left, the possible mastermind behind the plan to dominate Biringan City.");
        sc.nextLine();

        System.out.println("Andrea: Should we investigate the Babaylans? Their base is in Mt. Kanatuan.");
        sc.nextLine();

        System.out.println(player.name + ": I think we should. Even if Tria lied, this is our only clue.");
        sc.nextLine();

        System.out.println("You make your way towards the end of the tunnel, and the night air lingers thick\nand cold as you emerge into another realm just beyond Mogul.");
        sc.nextLine();

        System.out.println(player.name + ": Where are we?");
        sc.nextLine();

        System.out.println("The path ahead stretches into darkness once more. But somewhere beyond it lies Mt. Kanatuan. And with it, the truth behind the Babaylan’s sinister plan.");
        System.out.println();
        DialogueUtils.pause();

        return true;
    }
}
