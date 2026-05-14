package Core;

public enum EnemyAffix {
    NORMAL("Nameless", 0, 0, 0),
    VENGEFUL("Vengeful", 5, 0, 0),       // +5 Max Damage
    VICIOUS("Vicious", 0, 20, -2), // +20 HP, -2 Defense
    ANCIENT("Ancient", 2, 10, 1);       // Small boost to all

    public final String label;
    public final int damageMod;
    public final int hpMod;
    public final int defMod;

    EnemyAffix(String label, int damageMod, int hpMod, int defMod) {
        this.label = label;
        this.damageMod = damageMod;
        this.hpMod = hpMod;
        this.defMod = defMod;
    }
}
