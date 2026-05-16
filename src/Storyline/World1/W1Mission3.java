package Storyline.World1;

import Audio.MusicPlayer;
import Core.*;
import Display.ConsoleColors;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W1Mission3 {
    public static boolean mission3(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        // --- WORLD TITLE CARD (RED) ---
        System.out.println(ConsoleColors.BOLD_BLUE + "          ===============================================================WORLD 1====================================================================");
        System.out.println("          ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀█░░░░░░░▀█▀░█░█░█▀▀░░░█░█░█▀▀░█▀█░█▀▄░▀█▀░░░█▀█░█▀▀░░░█▀▄░█▀█░█▀▄░█░█░█▀█░█▀▀░█▀▀░█▀▀░░░░▄▀░░▄▀\n"
                + "          ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀▄░░▀░░░░░█░░█▀█░█▀▀░░░█▀█░█▀▀░█▀█░█▀▄░░█░░░░█░█░█▀▀░░░█░█░█▀█░█▀▄░█▀▄░█░█░█▀▀░▀▀█░▀▀█░░░▀▄░░▀▄\n"
                + "          ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀░░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀░▀░▀░▀░░▀░░░░▀▀▀░▀░░░░░▀▀░░▀░▀░▀░▀░▀░▀░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("          ==========================================================================================================================================" + ConsoleColors.RESET);

        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT/WHITE) ---
        System.out.println("Enlightened with the clues from the Information Guild, you hurry to the Dark Forest. Soon, you hear stomping and the sound of creaky wagon wheels turning through the soil.");
        System.out.println("There you see tiyanaks moving the wagon full of unconscious bodies of enkantos and diwatas. They are led by the giant entity, the Bungisngis.");
        System.out.println("You move towards the group quietly, hiding behind the bodies of trees, and observe what they might do.");
        scan.nextLine();
        System.out.println();
        System.out.println("The Bungisngis smiles wide and turns its eyes upon the bodies of the diwatas. You watch in nervous anticipation as the Bungisngis walks towards the wagon,");
        System.out.println("and ready yourself with your weapon as the giant reaches out to the wagon and raises the limp body of a diwata. The Bungisngis opens its mouth, salivating at the sight of its meal.");
        scan.nextLine();
        System.out.println("Just then, a whirl of wind slices the skin of the giant’s arm, causing it to drop the unconscious diwata back on the wagon.");
        System.out.println("Another diwata, the one who summoned the wind, rises, and you step out of hiding and move yourself between the wagon and the group of enemies.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- DIALOGUE (GREEN NPC / CYAN PLAYER) ---
        System.out.println(ConsoleColors.GREEN + "Conscious Diwata: Are you here to rescue us?" + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.CYAN + player.name + ": I am. Wake the others up and head to the city! I’ll stop them." + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Conscious Diwata: Alright!" + ConsoleColors.RESET);
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ENCOUNTER (YELLOW BOX) ---
        System.out.println(ConsoleColors.YELLOW + "                                      ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("                                      ┃ >> You encountered 3 tiyanaks and a Bungisngis.                                 ┃");
        System.out.println("                                      ┃                                                                                 ┃");
        System.out.println("                                      ┃ {Only tiyanaks can be targeted}                                                 ┃");
        System.out.println("                                      ┃ {Mini boss can only be targeted after wiping out the henchmen}                  ┃");
        System.out.println("                                      ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛" + ConsoleColors.RESET);
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(player, EnemyType.TIYANAK, 3);
        List<Enemy> enemies2 = EnemyFactory.spawnEnemies(player, EnemyType.BUNGISNGIS, 1);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 1, false);

        if (!survived) {
            return false;
        }

        scan.nextLine();
        System.out.println(ConsoleColors.GREEN + "Andrea: I’ve woken them all up. They’re escaping towards the city now. I’ll help you fight the Bungisngis. I’m Andrea, you are?" + ConsoleColors.RESET);
        scan.nextLine();
        System.out.println(ConsoleColors.CYAN + player.name + ": I'm " + player.name + ", let’s take this laughing monster down, Andrea." + ConsoleColors.RESET);
        scan.nextLine();

        survived = battle.startBattle(player, enemies2, 1, false);

        if (!survived) {
            return false;
        }

        player.resetCooldowns();

        scan.nextLine();
        System.out.println("The Bungisngis, no longer smiling, throws soil at both of you, effectively blocking your vision. It takes this chance to grab Andrea and run towards Mogul.");
        scan.nextLine();
        System.out.println(ConsoleColors.GREEN + "Andrea: Help!" + ConsoleColors.RESET);
        scan.nextLine();
        System.out.println(ConsoleColors.CYAN + player.name + ": Andrea!" + ConsoleColors.RESET);
        scan.nextLine();

        // --- SYSTEM/YOU ACTION (YELLOW) ---
        System.out.println(ConsoleColors.YELLOW + "Without a second thought, you rush towards Mogul." + ConsoleColors.RESET);
        scan.nextLine();

        // --- WORLD TRANSITION (YELLOW BOX) ---
        System.out.println(ConsoleColors.YELLOW + "          ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("          ┃            [ You have entered Mogul, the land of the Aswangs ]                  ┃");
        System.out.println("          ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛" + ConsoleColors.RESET);
        DialogueUtils.pause();

        return true;
    }
}