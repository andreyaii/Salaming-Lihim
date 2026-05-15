package Core;

import java.util.Random;
import Audio.MusicPlayer;
import Display.ConsoleColors;

public class Enemy {
    public String name;
    public int hp;
    public int defense; // Remove 'final' to allow modifiers
    public final EnemyType type;
    public EnemyAffix affix;

    public Enemy(String name, EnemyType type, int hp, EnemyAffix affix) {
        this.type = type;
        this.affix = affix;
        this.name = affix == EnemyAffix.NORMAL ? name : affix.label + " " + name;
        this.hp = hp + affix.hpMod;
        this.defense = 3 + affix.defMod; // Base defense
    }

    public boolean isAlive() {
        return hp > 0;
    }

    // Update dealDamage to include the damage modifier
    public int dealDamage(PlayerCharacter target) {
        MusicPlayer.playSFX(type.sfxFile); //
        System.out.println(name + " " + type.attackDescription + "!"); //

        int rawDamage = new java.util.Random().nextInt(type.maxDamage - type.minDamage + 1)
                + type.minDamage + affix.damageMod; // Apply mod

        int netDamage = Math.max(1, rawDamage - target.getDefense()); //
        target.modifyHp(netDamage); //
        System.out.println(ConsoleColors.RED + "Deals " + netDamage + " damage to " + target.name + "!" + ConsoleColors.RESET); //
        return netDamage;
    }
}

/*
package Core;

import java.util.Random;
import Audio.MusicPlayer;
import Display.ConsoleColors;

public class Enemy {

    public String name;
    public int hp;
    public final int defense = 3;
    public final EnemyType type;

    public Enemy(String name, EnemyType type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int dealDamage(PlayerCharacter target) {
        MusicPlayer.playSFX(type.sfxFile);

        System.out.println(name + " " + type.attackDescription + "!");
        int rawDamage = new Random().nextInt(type.maxDamage - type.minDamage + 1) + type.minDamage;
        int netDamage = Math.max(1, rawDamage - target.getDefense());
        // target.hp -= netDamage;
        target.modifyHp(netDamage);
        System.out.println(ConsoleColors.RED + "Deals " + netDamage + " damage to " + target.name + "!" + ConsoleColors.RESET);
        return netDamage;
    }
}
 */
