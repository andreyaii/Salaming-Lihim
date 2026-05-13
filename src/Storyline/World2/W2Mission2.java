package Storyline.World2;

import Audio.MusicPlayer;
import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W2Mission2 {
    public static boolean w2mission2(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        System.out.println();
        System.out.println("                   ======================================================================================================================");
        System.out.println("                   ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀▄░░░░░░░▀█▀░█▀█░░░█▀▀░█▀█░█░█░█▀▀░░░█▀█░░░█▀▀░█▀▄░▀█▀░█▀▀░█▀█░█▀▄░░░░▄▀░░▄▀");
        System.out.println("                   ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░▄▀░░░▀░░░░░█░░█░█░░░▀▀█░█▀█░▀▄▀░█▀▀░░░█▀█░░░█▀▀░█▀▄░░█░░█▀▀░█░█░█░█░░░▀▄░░▀▄░");
        System.out.println("                   ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░░▀░░▀▀▀░░░▀▀▀░▀░▀░░▀░░▀▀▀░░░▀░▀░░░▀░░░▀░▀░▀▀▀░▀▀▀░▀░▀░▀▀░░░░░░▀░░░▀");
        System.out.println("                   ======================================================================================================================");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("As you search for medicinal herbs, you hear footsteps approaching you, and you see an old man dressed in leather and leaves, matching the colors of the marsh. ");
        System.out.println("A bag is slung across his chest and his leather belt, carrying herbs and a potion bottle. ");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println(player.name + ": Who are you?");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("Tambalan: I'm a Tambalan. It looks like you need some help.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println(player.name + ": Wait, you're a Tambalan? Sir, please save my friend. She's dying.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("Tambalan: Hmm… I see. Well, I can save your friend. But you must do something for me in return.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println(player.name + ": Alright, I will. Just please save my friend.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("The Tambalan nods, and you take him to the small boulder where you left Andrea.\nThe color of her skin has turned very pale, and her eyes are nearly closed.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println(player.name + ": Andrea! Stay awake!");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("You rush to Andrea’s side and make sure she stays awake. The tambalan approaches and kneels down to inspect her condition.\nHe then reaches for a potion in his bag and opens it for Andrea to drink, tilting it against her lips carefully.\nAndrea swallows weakly, her body trembling. Color slowly returns to her cheeks, though her eyes remain closed.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("Tambalan: She will live. But your debt begins now.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("A sudden shriek cuts through the marshlands, high and guttural.\nFrom the treeline, a shape emerges—elongated limbs, a mouth split too wide, dripping with black rot and fresh blood.\nAn Aswang, its body shifting grotesquely between forms, crawls toward you with murderous intent. Its eyes lock not on you, but on the Tambalan.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("Tambalan: It comes for me. If you wish for your friend to live, you must keep me alive.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("The Aswang snarls, wings unfurling with a crack of sinew. It takes to the sky and the shadows unnaturally bend around its sinister form.");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.ASWANG, 2);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 2, false);

        if (!survived) {
            return false;
        }

        player.resetCooldowns();
        scan.nextLine();

        System.out.println("With one final strike, you drive the creature back. The Aswang lets out a keening howl before collapsing.\nIts body twists and contorts one last time, then dissolves into the black waters of the marsh.");
        System.out.println("You feel relief wash over you, but it’s cut short by the Tambalan’s voice.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("Tambalan: Saving her life was only the first step. If you intend for your friend to survive Mogul, find the Pandai who guards the weapon she needs. \nIt’s the only way.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("You nod, tightening your grip on your weapon before setting out to find the Pandai.");
        scan.nextLine();
        MusicPlayer.playSFX(MusicPlayer.CLICK);
        System.out.println("                                             [~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~]");;
        System.out.println("                                             [\tCongratulations! You’re no longer friendless! (\u2060 \u2060ꈍ\u2060ᴗ\u2060ꈍ\u2060)\t ]");
        System.out.println("                                             [\tAndrea joins you on your adventure!\t\t\t\t\t\t ]");
        System.out.println("                                             [~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~]\n");
        DialogueUtils.pause();
        return true;
    }
}
