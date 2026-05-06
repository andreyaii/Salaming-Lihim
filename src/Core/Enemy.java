package Core;
import java.util.Random;

public class Enemy {

    public String name;
    public int hp;
    public final int defense = 3;
    public final EnemyType type;

    public Enemy(String name, EnemyType type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int dealDamage(PlayerCharacter target) {
        //to be implemented
        return 0;
    }
}
