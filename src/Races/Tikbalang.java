package Races;

import Core.Race;
import Core.Enemy;
import java.util.Random;

public class Tikbalang extends Race {
    private int specialBonusDamage = 0;
    private final Random random = new Random();


    //basic stats
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

    //attacks
    public int attack() {
        return random.nextInt(11) + 5;
    }

    public String getAttackDesc() {
        return " charges with thunderous hooves!";
    }

    public void useSkill(String playerName, Enemy target) {
        System.out.println(playerName + " uses Three-strike Stab!");
        int dmg = random.nextInt(11) + 15;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " piercing damage to " + target.name + "!");
    }

    public void useSpecial(String playerName, Enemy target) {
        System.out.println(playerName + " Transcends! A thunderous hoof-stab deals massive damage!");
        int dmg = random.nextInt(31) + 25 + specialBonusDamage;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " piercing damage to " + target.name + "!");
    }

    //mana
    public int getSkillManaCost() { return 20; }
    public int getSpecialManaCost() { return 40; }
    public void increaseSpecialDamage(int amount) {
        this.specialBonusDamage += amount;
    }
}