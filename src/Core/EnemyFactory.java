package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemyFactory {
    private static final java.util.Random random = new java.util.Random();

    public static List<Enemy> spawnEnemies(EnemyType type, int count) {
        List<Enemy> enemies = new ArrayList<>();
        EnemyAffix[] affixes = EnemyAffix.values();

        for (int i = 1; i <= count; i++) {
            String baseName = type.typeName;
            int hp = 50 + random.nextInt(17); //

            // 40% chance to have a special affix, otherwise NORMAL
            EnemyAffix selectedAffix = (random.nextInt(100) < 40)
                    ? affixes[random.nextInt(affixes.length)]
                    : EnemyAffix.NORMAL;

            enemies.add(new Enemy(baseName, type, hp, selectedAffix));
        }
        return enemies;
    }

    public static List<Enemy> spawnBosses(EnemyType type, int count) {
        List<Enemy> bosses = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String name = "Boss " + type.typeName + " " + i; //
            int hp = 100 + random.nextInt(50); // 100–150 HP

            // We pass EnemyAffix.ANCIENT to make bosses naturally stronger
            bosses.add(new Enemy(name, type, hp, EnemyAffix.ANCIENT));
        }
        return bosses;
    }
}

/*
package Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemyFactory {

    //spawn normal enemies
    public static List<Enemy> spawnEnemies(EnemyType type, int count) {
        List<Enemy> enemies = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String name = type.typeName + " " + i;
            int hp = 50 + new Random().nextInt(17); //55-67 hp
            enemies.add(new Enemy(name, type, hp));
        }
        return enemies;
    }

    //spawn bosses
    public static List<Enemy> spawnBosses(EnemyType type, int count) {
        List<Enemy> bosses = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String name = "Boss " + type.typeName + " " + i;
            int hp = 100 + new Random().nextInt(50); // 100–150 HP
            bosses.add(new Enemy(name, type, hp));
        }
        return bosses;
    }
}
 */
