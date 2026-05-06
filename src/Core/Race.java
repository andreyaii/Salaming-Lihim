package Core;

public abstract class Race {
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

    public int getSkillCooldown()   { return 2; }
    public int getSpecialCooldown() { return 3; }
}