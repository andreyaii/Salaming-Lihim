package Races;

import Audio.MusicPlayer;
import Core.Enemy;
import Core.Race;
import Display.ConsoleColors;
import Display.RaceArt;
import java.util.Random;

public class Tikbalang extends Race {
    private int specialBonusDamage = 0;
    private final Random random = new Random();

    @Override
    public int getBaseHp() {
        return 185;
    }

    @Override
    public int getBaseMana() {
        return 155;
    }

    @Override
    public String getRaceName() {
        return "Tikbalang";
    }

    public int attack() {
        MusicPlayer.playSFX(MusicPlayer.SFX_HOOF_CHARGE);
        return random.nextInt(11) + 5;
    }

    public String getAttackDesc() {
        // Reverted to default text
        return " charges with thunderous hooves!";
    }

    public void useSkill(String playerName, Enemy target) {
        MusicPlayer.playSFX(MusicPlayer.SFX_TRIPLE_STAB);

        // Announcement line is now default
        System.out.println(playerName + " uses Three-strike Stab!");

        int dmg = random.nextInt(11) + 15;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;

        // Only the damage line remains Cyan
        System.out.println(ConsoleColors.CYAN + playerName + " deals " + netDmg + " piercing damage to " + target.name + "!" + ConsoleColors.RESET);
    }

    public void useSpecial(String playerName, Enemy target) {
        MusicPlayer.playSFX(MusicPlayer.SFX_TRANSCEND);

        // Announcement line is now default
        System.out.println(playerName + " Transcends! A thunderous hoof-stab deals massive damage!");

        int dmg = random.nextInt(31) + 25 + specialBonusDamage;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;

        // Only the damage line remains Cyan
        System.out.println(ConsoleColors.CYAN + playerName + " deals " + netDmg + " piercing damage to " + target.name + "!" + ConsoleColors.RESET);
    }

    public int getSkillManaCost()   { return 30; }
    public int getSpecialManaCost() { return 60; }

    public void increaseSpecialDamage(int amount) {
        this.specialBonusDamage += amount;
    }

    @Override
    public void displayArt() {
        RaceArt.displayTikbalang();
    }
}