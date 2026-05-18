package Core;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Race {

    public static Map<Integer, String> getAvailableRaces() {
        Map<Integer, String> races = new LinkedHashMap<>();
        races.put(1, "Tikbalang");
        races.put(2, "Kapre");
        return races;
    }

    public abstract String getRaceName();
    public abstract int getBaseHp();
    public abstract int getBaseMana();
    public abstract String getAttackDesc();
    public abstract int attack();
    public abstract void useSkill(String playerName, Enemy target);
    public abstract void useSpecial(String playerName, Enemy target);
    public abstract int getSkillManaCost();
    public abstract int getSpecialManaCost();
    public abstract void increaseSpecialDamage(int amount);

    public int getSkillCooldown()   { return 3; } // increased from 2
    public int getSpecialCooldown() { return 4; } // increased from 3

}