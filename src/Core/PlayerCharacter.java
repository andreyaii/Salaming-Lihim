package Core;

import java.util.ArrayList;
import java.util.List;

public class PlayerCharacter {
    public String name, race;
    private int hp, mana, defense = 5;
    private Race raceType;
    private final int manaRegen = 10;
    private int armorLevel = 0;
    public int maxHp;
    public int maxMana;
    private int level;
    private int barya = 0;
    private List<Item>  inventory = new ArrayList<>();

    public List<Item> getInventory() {
        return inventory;
    }


    // Cooldown counters
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
        this.level = 1;
    }

    public int getLevel() {
        return level;
    }


    public boolean isAlive() {
        return hp > 0;
    }


    public void dealDamage(Enemy target) {
        System.out.println(name + " " + raceType.getAttackDesc());
        int rawDamage = raceType.attack();
        int netDamage = Math.max(1, rawDamage - target.defense);
        target.hp -= netDamage;
        System.out.println(name + " deals " + netDamage + " damage to " + target.name + "!");
    }

    public void useSkill(Enemy target) {
        if (skillCooldown > 0) {
            System.out.println("Ability is on cooldown for " + skillCooldown + " more turn(s).");
            return;
        }
        if (mana < raceType.getSkillManaCost()) {
            System.out.println("Not enough mana!");
            return;
        }

        mana -= raceType.getSkillManaCost();
        if (mana < 0) mana = 0;

        raceType.useSkill(name, target);
        skillCooldown = raceType.getSkillCooldown();
    }

    public void useSpecial(Enemy target) {
        if (specialCooldown > 0) {
            System.out.println("Special is on cooldown for " + specialCooldown + " more turn(s).");
            return;
        }
        if (mana < raceType.getSpecialManaCost()) {
            System.out.println("Not enough mana to use special.");
            return;
        }
        mana -= raceType.getSpecialManaCost();
        if (mana < 0) mana = 0;
        raceType.useSpecial(name, target);
        specialCooldown = raceType.getSpecialCooldown();
    }

//    public int void regenerateMana() {
//        int before = mana;
//        mana = Math.min(mana + manaRegen, raceType.getBaseMana() + classType.getBonusMana());
//        System.out.println(name + " regenerates " + (mana - before) + " mana.");
//    }

    public void regenerateMana() {
        int before = mana;

        if (mana < maxMana) {
            mana = Math.min(mana + 10, maxMana);
            System.out.println(name + " regenerates " + (mana - before) + " mana.");
        } else {
            System.out.println(name + " is already at full mana.");
        }
    }


    public void reduceCooldowns() {
        if (skillCooldown > 0) skillCooldown--;
        if (specialCooldown > 0) specialCooldown--;
    }

    public void resetCooldowns() {
        specialCooldown = 2;
        skillCooldown = 0;
    }

    public void displayStats() {
        System.out.println("\n                                                            📜 ════ 𝕮𝖍𝖆𝖗𝖆𝖈𝖙𝖊𝖗 𝕻𝖗𝖊𝖛𝖎𝖊𝖜 ════ 📜");
        System.out.printf("                                                           ────────────────────────────────\n");
        System.out.printf("                                                             >> Name      : %s\n", name);
        System.out.printf("                                                             >> Race      : %s\n", race);
        System.out.printf("                                                           ────────────────────────────────\n");
        System.out.printf("                                                             >> HP        : %d/%d\n", hp, maxHp);
        System.out.printf("                                                             >> Mana      : %d/%d\n", mana, maxMana);
        System.out.printf("                                                             >> Defense   : %d (Passive)\n", defense);
        System.out.printf("                                                           ────────────────────────────────\n");
        if (inventory.isEmpty()) {
            System.out.println("                                                             >> Inventory : (empty)");
        } else {
            System.out.print("                                                             >> Inventory : ");
            for (int i = 0; i < inventory.size(); i++) {
                System.out.print(inventory.get(i).getName());
                if (i < inventory.size() - 1) System.out.print(", ");
            }
            System.out.println();
        }
        System.out.printf("                                                             >> Barya     : %d\n", barya);
        System.out.println("                                                           ────────────────────────────────\n");
    }

    // ----- Inventory -----

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void showInventory() {
        System.out.println("\n=== 🎒 Inventory ===");
        if (inventory.isEmpty()) {
            System.out.println("You have no items.");
        } else {
            for (int i = 0; i < inventory.size(); i++) {
                System.out.println((i + 1) + ". " + inventory.get(i).getName());
            }
        }
    }

    public void useItem(Item item) {
        switch (item.getName()) {

            case "Health Potion":
                setHp(maxHp);
                inventory.remove(item);
                System.out.println("\n🧪 You used a Health Potion -- the elixir of life! HP fully restored.\n");
                break;

            case "Mana Potion":
                mana = maxMana;
                inventory.remove(item);
                System.out.println("\n🔮 You used a Mana Potion -- the elixir of power! Mana fully restored.\n");
                break;

            default:
                System.out.println("\n❌ You can't use this item.\n");
        }
    }

    public void modifyHp(int amount) {
        hp -= amount;

        if (hp < 0) hp = 0;
        if (hp > maxHp) hp = maxHp;
    }


    public boolean isAlive;
    public void setAlive(boolean alive) {
        //this.isAlive = alive;   (NOT USED - LEAVE IT EMPTY)
    }
    // ----- Barya -----

    public int getBarya() {
        return barya;
    }

    public void setBarya(int amount) {
        this.barya = amount;
    }

    public void addBarya(int amount) {
        this.barya += amount;
    }

    // ----- Mana, hp, and Defense setters/getters -----

    public void setMana(int mana) {
        this.mana = Math.max(0, Math.min(mana, maxMana));
    }

    public int getMana(){
        return mana;
    }

    public void setHp(int hp){
        if (hp > maxHp) {
            this.hp = maxHp;
        } else {
            this.hp = hp;
        }
    }

    public int getHp(){
        return hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void buyArmor() {
        armorLevel++;

        int addedDefense = 0;

        if (armorLevel == 1) {
            addedDefense = 2;
        } else if (armorLevel == 2) {
            addedDefense = 3;
        } else if (armorLevel == 3) {
            addedDefense = 5;
        } else {
            addedDefense = 5;
        }

        defense += addedDefense;

        System.out.println("                                             ️🛡️ Armor upgraded! Defense +" + addedDefense + " (Total Defense: " + defense + ")\n");
    }

    public int getArmorLevel(){
        return armorLevel;
    }

    public void rest() {
        setHp(maxHp);
        setMana(maxMana);
        //reset cooldowns

        System.out.println(name + " was able to get some rest.");
        System.out.println("Health and Mana recovered to full!");
        System.out.println();
    }

    public void levelUp() {
        level++;

        maxHp = (int) Math.round(maxHp * Math.pow(1.10, 1));
        hp = maxHp;
        mana = maxMana = (int) Math.round(maxMana * Math.pow(1.10, 1));
    }

    public void boostSpecialPower(int amount) {
        raceType.increaseSpecialDamage(amount);
    }
}