package Storyline.World1;

import Audio.MusicPlayer;
import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W1Mission3 {
    public static boolean mission3(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("          ==========================================================================================================================================");
        System.out.println("          ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀█░░░░░░░▀█▀░█░█░█▀▀░░░█░█░█▀▀░█▀█░█▀▄░▀█▀░░░█▀█░█▀▀░░░█▀▄░█▀█░█▀▄░█░█░█▀█░█▀▀░█▀▀░█▀▀░░░░▄▀░░▄▀\n"
                + "          ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀▄░░▀░░░░░█░░█▀█░█▀▀░░░█▀█░█▀▀░█▀█░█▀▄░░█░░░░█░█░█▀▀░░░█░█░█▀█░█▀▄░█▀▄░█░█░█▀▀░▀▀█░▀▀█░░░▀▄░░▀▄\n"
                + "          ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀░░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀░▀░▀░▀░░▀░░░░▀▀▀░▀░░░░░▀▀░░▀░▀░▀░▀░▀░▀░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("          ==========================================================================================================================================");

        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("Enlightened with the clues from the Information Guild, you hurry to the Dark Forest. Soon, you hear stomping and the sound of creaky wagon wheels turning through the soil.");
        DialogueUtils.pause();
        System.out.println("There you see tiyanaks moving the wagon full of unconscious bodies of enkantos and diwatas.");
        System.out.println("They are led by the giant entity, the Bungisngis.");
        System.out.println("You move towards the group quietly, hiding behind the bodies of trees, and observe what they might do.");
        DialogueUtils.pause();
        System.out.println();
        System.out.println("The Bungisngis smiles wide and turns its eyes upon the bodies of the diwatas.");
        System.out.println("You watch in nervous anticipation as the Bungisngis walks towards the wagon,");
        System.out.println("and ready yourself with your weapon as the giant reaches out to the wagon and raises the limp body of a diwata.");
        System.out.println("The Bungisngis opens its mouth, salivating at the sight of its meal.");
        DialogueUtils.pause();
        System.out.println("Just then, a whirl of wind slices the skin of the giant’s arm, causing it to drop the unconscious diwata back on the wagon.");
        System.out.println("Another diwata, the one who summoned the wind, rises, and you step out of hiding and move yourself between the wagon and the group of enemies.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("Conscious Diwata: Are you here to rescue us?");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(player.name + ": I am. Wake the others up and head to the city! I’ll stop them.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("Conscious Diwata: Alright!");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("[You encountered 3 tiyanaks and a Bungisngis.]\n\n{Only tiyanaks can be targeted}\n{Mini boss can only be targeted after wiping out the henchmen}\n");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.TIYANAK, 3);
        List<Enemy> enemies2 = EnemyFactory.spawnEnemies(EnemyType.BUNGISNGIS, 1);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 1, false);

        if (!survived) {
            return false;
        }

        scan.nextLine();
        System.out.println("Conscious Diwata: I’ve woken them all up. They’re escaping towards the city now. I’ll help you fight the Bungisngis. I’m Andrea, you are?");
        scan.nextLine();
        System.out.println(player.name + ": I'm " + player.name + ", let’s take this laughing monster down, Andrea.");
        scan.nextLine();

        survived = battle.startBattle(player, enemies2, 1, false);

        if (!survived) {
            return false;
        }

        player.resetCooldowns();

        scan.nextLine();
        System.out.println("The Bungisngis, no longer smiling, throws soil at both of you, effectively " +
                "blocking your vision. It takes this chance to grab Andrea and run towards Mogul.");
        scan.nextLine();
        System.out.println("Andrea: Help!");
        scan.nextLine();
        System.out.println(player.name + ": Andrea!");
        scan.nextLine();
        System.out.println("Without a second thought, you rush towards Mogul.");
        scan.nextLine();
        System.out.println("[You have entered Mogul, the land of the Aswangs]");
        DialogueUtils.pause();

        return true;
    }
}
