package Core;

import java.util.ArrayList;
import java.util.List;

public class EnemyFactory {
    private static final java.util.Random random = new java.util.Random();

    public static List<Enemy> spawnEnemies( PlayerCharacter player, int currentWorld, EnemyType type, int count
        /*EnemyType type, int count*/) {
    List<Enemy> enemies = new ArrayList<>();
    EnemyAffix[] affixes = EnemyAffix.values();

    for (int i = 1; i <= count; i++) {
        String baseName = type.typeName;

        int baseHp;

        switch (currentWorld) {
            case 1 -> baseHp = 45;
            case 2 -> baseHp = 75;
            case 3 -> baseHp = 115;
            default -> baseHp = 45;
        }

        int hp = baseHp + random.nextInt(16) + ((player.getLevel() - 1) * 1);
        EnemyAffix selectedAffix = (random.nextInt(100) < 20)
                ? affixes[random.nextInt(affixes.length)]
                : EnemyAffix.NORMAL;

        enemies.add(new Enemy(baseName, type, hp, selectedAffix));
    }
    return enemies;
}

        public static List<Enemy> spawnBosses(PlayerCharacter player, int currentWorld, EnemyType type, int count) {
        List<Enemy> bosses = new ArrayList<>();

        for (int i = 1; i <= count; i++) {

            String name = "Boss " + type.typeName + " " + i;

            int baseHp;

            switch (currentWorld) {
                case 1 -> baseHp = 120;
                case 2 -> baseHp = 190;
                case 3 -> baseHp = 280;
                default -> baseHp = 120;
            }

            int hp = baseHp + random.nextInt(31) + ((player.getLevel() - 1) * 2);

            bosses.add(new Enemy(name, type, hp, EnemyAffix.ANCIENT));
        }

        return bosses;
    }
}
