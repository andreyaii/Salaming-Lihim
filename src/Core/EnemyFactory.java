package Core;

public class EnemyFactory {
    public Enemy(String name, EnemyType type, int hp, EnemyAffix affix) {
        this.type = type;
        this.affix = affix;
        this.name = affix == EnemyAffix.NORMAL ? name : affix.label + " " + name;
        this.maxHp = hp + affix.hpMod;
        this.hp = hp + affix.hpMod;
        this.defense = 3 + affix.defMod; // Base defense
    }
}
