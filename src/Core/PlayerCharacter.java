package Core;

import java.util.ArrayList;
import java.util.List;

public class PlayerCharacter {
    public String name;
    public String race;
    private int hp, mana, defense = 5;
    private Race raceType;
    public int maxHp;
    public int maxMana;
    private int level = 1;
    private int barya = 0;
    private int armorLevel = 0;
    private List<Item> inventory = new ArrayList<>();

    private int skillCooldown = 0;
    private int specialCooldown = 2;

    public PlayerCharacter(String name, Race raceType) {
        this.name = name;
        this.raceType = raceType;
        this.race = raceType.getRaceName();
        this.maxHp = raceType.getBaseHp();
        this.maxMana = raceType.getBaseMana();
        this.hp = maxHp;
        this.mana = maxMana;
    }

    // TODO: implement displayStats()
    // TODO: implement useSkill()
    // TODO: implement useSpecial()
    // TODO: implement shop-related methods
    // TODO: implement levelUp()
    // TODO: implement rest()

    // ── needed by Enemy.java ──────────────────
    public int getDefense() { return defense; }

    public void modifyHp(int amount) {
        hp -= amount;
        if (hp < 0) hp = 0;
        if (hp > maxHp) hp = maxHp;
    }
    // ─────────────────────────────────────────

    public boolean isAlive()         { return hp > 0; }
    public int getHp()               { return hp; }
    public int getMana()             { return mana; }
    public int getBarya()            { return barya; }
    public int getArmorLevel()       { return armorLevel; }
    public int getLevel()            { return level; }
    public List<Item> getInventory() { return inventory; }

    public void setHp(int hp)        { this.hp = Math.min(hp, maxHp); }
    public void setMana(int mana)    { this.mana = Math.max(0, Math.min(mana, maxMana)); }
    public void setBarya(int amt)    { this.barya = amt; }
    public void addBarya(int amt)    { this.barya += amt; }
    public void addItem(Item item)   { inventory.add(item); }

    public boolean isAlive;
    public void setAlive(boolean alive) { this.isAlive = alive; }
}