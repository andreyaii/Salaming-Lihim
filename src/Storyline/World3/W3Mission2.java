package Storyline.World3;

import Audio.MusicPlayer;
import Core.*;
import Display.ConsoleColors;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W3Mission2 {
    public static boolean w3mission2(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        // --- WORLD TITLE CARD (RED) ---
        System.out.println(ConsoleColors.BOLD_BLUE + "  ============================================================================================================================================================");
        System.out.println("  ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀▄░░░░░░░▀█▀░█░█░█▀▀░░░█▀▄░█░█░▀█▀░█▀█░█▀▀░░░█▀█░█▀▀░░░█▀▄░█▀█░█▀█░█░█░█▀█░░░░░█▀█░█▀█░░░█▀▄░█▀█░█▀█░█▀█░░░░▄▀░░▄▀ ");
        System.out.println("  ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░▄▀░░░▀░░░░░█░░█▀█░█▀▀░░░█▀▄░█░█░░█░░█░█░▀▀█░░░█░█░█▀▀░░░█▀▄░█▀█░█░█░█▄█░█▀█░▄▄▄░█▀█░█░█░░░█░█░█▀█░█▀█░█░█░░░▀▄░░▀▄░ ");
        System.out.println("  ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀▀▀░▀░▀░▀▀▀░░░▀▀▀░▀░░░░░▀▀░░▀░▀░▀░▀░▀░▀░▀░▀░░░░░▀░▀░▀░▀░░░▀▀░░▀░▀░▀░▀░▀░▀░░░░░▀░░░▀ ");
        System.out.println("  ============================================================================================================================================================" + ConsoleColors.RESET);

        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("The three of you follow the guidance of the map as it leads you through ancient ruins until you reach a grand hall where massive moonstone pillars encircle a raised altar.\nUpon it rests a blade glowing faintly silver: the Blade of Bulan.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- PLAYER DIALOGUE (CYAN) ---
        System.out.println(ConsoleColors.CYAN + player.name + ": There it is. The goddess’s weapon." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("But before you can move closer, shadows stir at the edges of the chamber and a pair of Babaylan Sentinels emerge.\nTwisted humanoid figures cloaked in bone charms, their eyes glowing red with witchfire.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- ENCOUNTER (YELLOW) ---
        System.out.println(ConsoleColors.YELLOW + "[You encountered 2 Babaylan Sentinels. Please choose a target and an attack.]" + ConsoleColors.RESET);

        List<Enemy> enemies = EnemyFactory.spawnEnemies(player,EnemyType.BABAYLANS2, 2);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 3, false);
        if (!survived) {
            return false;
        }

        player.resetCooldowns();
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("When the last guardian falls, silence returns, broken only by the faint hum of the Blade.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Andrea: They were protecting this." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        System.out.println(ConsoleColors.GREEN + "Kheila: And for good reason. This is the only weapon that can stand a chance against the Mistress." + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("You step forward. The Blade of Bulan seems to breathe, silver light rippling across its edge." +
                "As your hand touches the hilt, a surge of divine power courses through your arm, searing your veins with radiant energy.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- SYSTEM PROMPT / UNLOCK (YELLOW) ---
        System.out.println(ConsoleColors.YELLOW + "[New Ability Unlocked – Moonstrike: Channels lunar energy to purify corrupted magic.]" + ConsoleColors.RESET);
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NARRATION (DEFAULT) ---
        System.out.println("The chamber trembles. The moonlight shifts, revealing a hidden compartment beneath the altar.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("You unfurl the ancient parchment. Strange runes and shifting lines mark a region deep within Mt. Kanatuan — the heart of the Babaylan fortress.");
        sc.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);

        // --- NPC DIALOGUE (GREEN) ---
        System.out.println(ConsoleColors.GREEN + "Kheila: This isn’t a map of Banwa-an Daan. This leads to their most guarded chamber- the Sanctum of Eclipse." +
                "Only the highest-ranked Babaylan is allowed access to it.\nThis is where we'll find the mistress." + ConsoleColors.RESET);

        DialogueUtils.pause();

        return true;
    }
}