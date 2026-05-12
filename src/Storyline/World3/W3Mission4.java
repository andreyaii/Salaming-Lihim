package Storyline.World3;

import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W3Mission4 {

    public static boolean w3mission4(PlayerCharacter player) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("    ======================================================================================================================================================");
        System.out.println("    ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░█░█░░░░░░░▀█▀░█░█░█▀▀░░░█▄█░▀█▀░█▀▀░▀█▀░█▀▄░█▀▀░█▀▀░█▀▀░░░█▀█░█▀▀░░░█▀▄░█▀█░█▀▄░█░█░█▀█░█▀▀░█▀▀░█▀▀░░░░▄▀░░▄▀ ");
        System.out.println("    ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀█░░▀░░░░░█░░█▀█░█▀▀░░░█░█░░█░░▀▀█░░█░░█▀▄░█▀▀░▀▀█░▀▀█░░░█░█░█▀▀░░░█░█░█▀█░█▀▄░█▀▄░█░█░█▀▀░▀▀█░▀▀█░░░▀▄░░▀▄░");
        System.out.println("    ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░░░▀░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀▀▀░░▀░░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░▀▀▀░▀░░░░░▀▀░░▀░▀░▀░▀░▀░▀░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("    ======================================================================================================================================================");
        System.out.println();
        sc.nextLine();
        System.out.println("Wary of the darkness, Kheila casts a spell of light and the Babaylans hiding in the shadows are revealed.");
        sc.nextLine();
        System.out.println("[You have encountered 8 Babaylans. Please choose a target and an attack.]");

        List<Enemy> bosses = EnemyFactory.spawnBosses(EnemyType.ERIKA, 1);
        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.ERIKA2, 2);
        List<Enemy> enemies1 = EnemyFactory.spawnEnemies(EnemyType.HUMANS, 2);
        List<Enemy> enemies2 = EnemyFactory.spawnEnemies(EnemyType.BABAYLANS, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies2, 3, true);

        if (!survived) {
            return false;
        }
        player.resetCooldowns();

        System.out.println("The last Babaylan crouches in defeat. She looks up at Kheila weakly but with a resentful glare.");
        sc.nextLine();
        System.out.println("Babaylan: Traitor! We’ll never forgive you! Mistress Erika will never forgive you! She trusted you above all! You…");
        sc.nextLine();
        System.out.println("The Babaylan coughs out blood and collapses without finishing her last words.\n" +
                "Kheila looks at the Babaylan with mixed emotions, but one emotion rises among them… guilt. Both you and Andrea notice this.");
        sc.nextLine();
        System.out.println("Andrea: Don’t listen to her, Kheila! You’re doing the right thing. You don’t need anyone’s forgiveness.");
        sc.nextLine();
        System.out.println(player.name + ": Andrea’s right, Kheila. But will you be alright when facing Erika? If that Babaylan is to be believed, it appears the two of you were close.");
        sc.nextLine();
        System.out.println("Kheila: We used to be the best of friends. But I’ll be alright. I can’t let Erika continue down this road.");
        sc.nextLine();
        System.out.println(player.name + ": We better brace ourselves. She’ll be behind this room.");
        sc.nextLine();
        System.out.println("Your grip tightens on the sword. Andrea exchanges weighted stares with you and Kheila before opening the door.");
        sc.nextLine();
        System.out.println("There, you see Erika in the middle of the room, surrounded by herbs and the ingredients for a ritual.");
        sc.nextLine();
        System.out.println("Kheila: She’s casting the spell! Erika! You must stop this madness.");
        sc.nextLine();
        System.out.println("Kheila's shout catches her attention, and Erika looks up, her eyes burning with divine fury.");
        sc.nextLine();

        System.out.println("Erika: So… you’re the Fool wielding the goddess’s toy. Do you even know whose war you’re fighting?");
        sc.nextLine();
        System.out.println("Kheila: You betrayed our kin! You were supposed to protect the balance, not destroy it!");
        sc.nextLine();
        System.out.println("Erika: Balance? Do you still believe in that? The humans promised us liberation. A world where we’re no longer scorned, no longer hidden!");
        sc.nextLine();
        System.out.println("Andrea: And you believed them?");
        sc.nextLine();
        System.out.println("Erika lets out a bitter howl of laughter at that question.");
        sc.nextLine();
        System.out.println("Erika: You think they lied? They offered us power. A chance to rule beside them!");
        sc.nextLine();
        System.out.println("The ground shakes. The symbols on the walls shift from blue to a blood-red hue.");
        sc.nextLine();
        System.out.println(player.name + ": Power in exchange for obedience. You’ve been used, Erika.");
        sc.nextLine();
        System.out.println("Erika: Lies!");
        sc.nextLine();
        System.out.println("Andrea: They were never your allies, Erika. They were waiting to take it all. Mogul, Biringan, even your people.");
        sc.nextLine();
        System.out.println("Erika thinks for a moment, then screams.");
        sc.nextLine();
        System.out.println("Erika: Then I’ll burn everything to the ground!");
        sc.nextLine();
        System.out.println("The ritual circle flares, her body absorbing corrupted power. She becomes monstrous.\n" +
                "A chimera that's part woman, part shadow flame.");
        sc.nextLine();

        System.out.println("[You have angered the leader of the Babaylans. Choose your attack.]");
        sc.nextLine();

        survived = battle.startBattle(player, bosses, 3, true);

        if (!survived) {
            return false;
        }
        player.resetCooldowns();

        System.out.println();
        System.out.println("I REFUSE TO FALL LIKE THIS! MY CLONES, HELP ME!");
        sc.nextLine();


        survived = battle.startBattle(player, enemies, 3, true);

        if (!survived) {
            return false;
        }

        player.resetCooldowns();

        System.out.println("The Blade of Bulan glows fiercely, resonating with your heart. You strike, each blow cutting through layers of darkness.");
        sc.nextLine();
        System.out.println("As Erika collapses, the corruption begins to peel away. Her voice trembles.");
        sc.nextLine();
        System.out.println("Erika: I… was supposed to rule everything…");
        sc.nextLine();
        System.out.println("Her body turns to silver dust, scattering into the air like moonlight.");
        sc.nextLine();
        System.out.println("A sudden voice echoes from above. Cold, mechanical, and human.");
        sc.nextLine();
        System.out.println("???: The operation is complete. Terminate all surviving Babaylans and invading mythical creatures. Begin Phase Two.");
        sc.nextLine();
        System.out.println("The runes flare. From the walls emerge armored silhouettes. Human soldiers wielding weapons that glow with stolen magic.");
        sc.nextLine();

        survived = battle.startBattle(player, enemies1, 3, false);

        if (!survived) {
            return false;
        }

        player.resetCooldowns();
        sc.nextLine();

        System.out.println("After defeating the last of the wretched human soldiers, Kheila sways on weak legs and falls to her knees\n" +
                "on the ground, tears running like a violent downpour from her eyes.");
        sc.nextLine();
        System.out.println("Kheila: The humans played us all. The Babaylans, the creatures of Mogul, even the goddess’s light.");
        sc.nextLine();
        System.out.println("Andrea: Then our war isn’t over. We stopped the Mistress, but the real enemy is still out there.");
        sc.nextLine();
        System.out.println(player.name + ": Then we fight them next. For Mogul. For Biringan. For all of us.");
        sc.nextLine();
        System.out.println("The Sanctum crumbles. The moonlight above dims and is soon replaced by the red glow of human war machines rising over the horizon.");
        DialogueUtils.pause();

        return true;
    }
}
