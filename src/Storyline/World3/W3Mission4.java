package Storyline.World3;

import Audio.MusicPlayer;
import Core.*;
import Display.ConsoleColors;
import Storyline.DialogueUtils;
import java.util.List;
import java.util.Scanner;

public class W3Mission4 {

    public static boolean w3mission4(PlayerCharacter player) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        // --- WORLD TITLE CARD (RED) ---
        System.out.println(ConsoleColors.BOLD_BLUE + "    ===========================================================================WORLD 3====================================================================");
        System.out.println("    ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░█░█░░░░░░░▀█▀░█░█░█▀▀░░░█▄█░▀█▀░█▀▀░▀█▀░█▀▄░█▀▀░█▀▀░█▀▀░░░█▀█░█▀▀░░░█▀▄░█▀█░█▀▄░█░█░█▀█░█▀▀░█▀▀░█▀▀░░░░▄▀░░▄▀ ");
        System.out.println("    ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀█░░▀░░░░░█░░█▀█░█▀▀░░░█░█░░█░░▀▀█░░█░░█▀▄░█▀▀░▀▀█░▀▀█░░░█░█░█▀▀░░░█░█░█▀█░█▀▄░█▀▄░█░█░█▀▀░▀▀█░▀▀█░░░▀▄░░▀▄░");
        System.out.println("    ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░░░▀░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀▀▀░░▀░░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░▀▀▀░▀░░░░░▀▀░░▀░▀░▀░▀░▀░▀░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("    =======================================================================================================================================================" + ConsoleColors.RESET);
        System.out.println();
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("Wary of the darkness, Kheila casts a spell of light and the Babaylans hiding in the shadows are revealed.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ENCOUNTER (YELLOW) ---
        System.out.println(ConsoleColors.YELLOW + "[You have encountered 8 Babaylans. Please choose a target and an attack.]" + ConsoleColors.RESET);

        List<Enemy> bosses = EnemyFactory.spawnBosses(player,3, EnemyType.ERIKA, 1);
        List<Enemy> enemies = EnemyFactory.spawnEnemies(player,3, EnemyType.ERIKA2, 2);
        //List<Enemy> enemies1 = EnemyFactory.spawnEnemies(player,EnemyType.HUMANS, 2);
        List<Enemy> enemies2 = EnemyFactory.spawnEnemies(player,3,  EnemyType.BABAYLANS, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies2, 3, true);

        if (!survived) {
            return false;
        }
        player.resetCooldowns();

        System.out.println("The last Babaylan crouches in defeat. She looks up at Kheila with a resentful glare.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.RED + "Babaylan: Traitor! Mistress Erika trusted you above all! You…" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("The Babaylan coughs out blood and collapses without finishing her last words.\n" +
                "Andrea notices the guilt in Kheila's eyes.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Andrea: Don’t listen to her, Kheila! You’re doing the right thing." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": Will you be alright when facing Erika?" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Kheila: Yes. We used to be the best of friends, but I can’t let Erika continue down this road." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);


        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("Opening the door, you see Erika in the middle of the room, surrounded by herbs and the ingredients for a ritual.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Kheila: Erika, stop! You were supposed to protect the balance, not destroy it!" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ERIKA DIALOGUE (RED) ---
        System.out.println(ConsoleColors.RED + "Erika: Balance? The humans promised us liberation. A world where we’re no longer scorned, no longer hidden!" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Andrea: And you believed them?" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ERIKA DIALOGUE (RED) ---
        System.out.println(ConsoleColors.RED + "Erika: You think they lied? They offered us power. A chance to rule beside them!" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": Power in exchange for obedience. You’ve been used, Erika." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ERIKA DIALOGUE (RED) ---
        System.out.println(ConsoleColors.RED + "Erika: Lies!" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Andrea: They were never your allies, Erika. They were waiting to take it all. Mogul, Biringan, even your people." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("Erika thinks for a moment, then screams.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ERIKA DIALOGUE (RED) ---
        System.out.println(ConsoleColors.RED + "Erika: Then I’ll burn everything to the ground!" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("The ritual circle flares, her body absorbing corrupted power. She becomes monstrous.\n" +
                "A chimera that's part woman, part shadow flame.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ENCOUNTER (YELLOW) ---
        System.out.println(ConsoleColors.YELLOW + "[You have angered the leader of the Babaylans. Choose your attack.]" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        survived = battle.startBattle(player, bosses, 3, true);

        if (!survived) {
            return false;
        }
        player.resetCooldowns();

        System.out.println();
        // --- ERIKA DIALOGUE (RED) ---
        System.out.println(ConsoleColors.RED + "Erika: I REFUSE TO FALL LIKE THIS! MY CLONES, HELP ME!" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        survived = battle.startBattle(player, enemies, 3, true);

        if (!survived) {
            return false;
        }

        player.resetCooldowns();

        System.out.println("The Blade of Bulan glows fiercely, resonating with your heart. You strike, each blow cutting through layers of darkness.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("At last, Erika collapses. The corruption fades, revealing the woman beneath.\n" +
                "\n" +
                "Her eyes find Kheila.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ERIKA DIALOGUE (RED) ---
        System.out.println(ConsoleColors.RED + "Erika: Kheila..." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("Kheila kneels beside her and takes her hand.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.RED + "Erika: I only wanted for us... to stop hiding..." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("A sudden voice echoes from a device nearby. Cold, mechanical, and human.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.BOLD_RED + "???: Subject Erika has fallen. Withdraw all remaining forces." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);


        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Kheila: The humans manipulated everything." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Andrea: And Erika paid the price for it." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": We should go, guys. We have work to do." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println("The Sanctum begins to collapse. You, Andrea, and Kheila escape just as the ruins cave in behind you. \n" +
                "In the distance, you see the shimmering metropolis of Biringan City as dawn washes over it.\n" +
                "For the first time in what feels like an eternity, everything is quiet.");
        DialogueUtils.pause();

        return true;
    }
}