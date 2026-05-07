package Core;

import java.util.List;
import java.util.Scanner;

public class InventoryMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void open(PlayerCharacter player) {
        List<Item> inv = player.getInventory();

        if (inv.isEmpty()) {
            System.out.print("                                                   ┏━───────────────────────────────────────────━┓\n");
            System.out.print("                                                            ++ Your inventory is empty. ++\n");
            System.out.println("                                                   ┗━───────────────────────────────────────────━┛");
            return;
        }
    }
}
