package Races;

import Core.Enemy;
import Core.Race;

import java.util.Random;

abstract class Kapre extends Race {

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
        return random.nextInt(11) + 5;
    }

    public String getAttackDesc() {
        return " engulfs the enemy with thick cigar smoke!";
    }

    //to implement
    public void useSkill(String playerName, Enemy target) {

    }

    //to implement
    public void useSpecial(String playerName, Enemy target) {

    }

    public int getSkillManaCost() { return 20; }
    public int getSpecialManaCost() { return 40; }

    //special Damage
}
