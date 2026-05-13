package Races;

import Core.Race;
import Core.Enemy;
import Display.RaceArt;
import Audio.MusicPlayer;

import java.util.Random;

public class Kapre extends Race {
    private int heatPowerBonus = 0;
    private final Random random = new Random();

    @Override
    public int getBaseHp() {
        return 180;
    }

    @Override
    public int getBaseMana() {
        return 140;
    }

    @Override
    public String getRaceName() { return "Kapre"; }

    public int attack() {
        MusicPlayer.playSFX(MusicPlayer.SFX_KAPRE_ATTACK);
        return random.nextInt(11) + 5;
    }

    public String getAttackDesc() {
        return " engulfs the enemy with thick cigar smoke!";
    }

    public void useSkill(String playerName, Enemy target) {
        MusicPlayer.playSFX(MusicPlayer.SFX_SMOKE_CLOUD);

        System.out.println(playerName + " exhales a massive Smoke Cloud!");
        int dmg = random.nextInt(11) + 15;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " suffocation damage to " + target.name + "!");
    }

    public void useSpecial(String playerName, Enemy target) {
        MusicPlayer.playSFX(MusicPlayer.SFX_CINDER_BLAST);

        System.out.println(playerName + " unleashes the Cinder Blast!");
        int dmg = random.nextInt(31) + 25 + heatPowerBonus;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " thermal damage to " + target.name + "!");
    }

    public int getSkillManaCost()   { return 30; } // increased from 20
    public int getSpecialManaCost() { return 60; } // increased from 40

    public void increaseSpecialDamage(int amount) { this.heatPowerBonus += amount; }

    @Override
    public void displayArt() {
        RaceArt.displayKapre();
    }
}