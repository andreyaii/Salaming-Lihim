package Races;

import Core.Enemy;
import Core.Race;
import java.util.Random;

public class Kapre extends Race {
    private int heatPowerBonus = 0;
    private final Random random = new Random();

    @Override
    public int getBaseHp()        { return 180; }

    @Override
    public int getBaseMana()      { return 140; }

    @Override
    public String getRaceName()   { return "Kapre"; }

    @Override
    public int attack()           { return random.nextInt(11) + 5; }

    @Override
    public String getAttackDesc() { return " engulfs the enemy with thick cigar smoke!"; }

    @Override
    public void useSkill(String playerName, Enemy target) {
        System.out.println(playerName + " exhales a massive Smoke Cloud!");
        int dmg = random.nextInt(11) + 15;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " suffocation damage to " + target.name + "!");
    }

    @Override
    public void useSpecial(String playerName, Enemy target) {
        System.out.println(playerName + " unleashes the Cinder Blast!");
        int dmg = random.nextInt(31) + 25 + heatPowerBonus;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " thermal damage to " + target.name + "!");
    }

    @Override
    public int getSkillManaCost()   { return 20; }

    @Override
    public int getSpecialManaCost() { return 40; }

    @Override
    public void increaseSpecialDamage(int amount) { this.heatPowerBonus += amount; }
}