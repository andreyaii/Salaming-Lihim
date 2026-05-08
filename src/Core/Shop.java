package Core;

import Storyline.DialogueUtils;
import java.util.*;

public class Shop {
    private static List<Item> items = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {

        items.add(new Item("Mana Potion", 75, "Regenerates mana to full", ItemType.MANA));
        items.add(new Item("Health Potion", 75, "Regenerates HP to full", ItemType.HEALTH));
        items.add(new Item("Armor Upgrade", 125, "Increases defense by 2/4/7", ItemType.ARMOR_UPGRADE));
    }

    public static void enterShop(PlayerCharacter player) {
        System.out.println("                                              ┃  ┃┃┃┏━┛┃  ┏━┛┏━┃┏┏ ┏━┛  ━┏┛┏━┃  ━┏┛┃ ┃┏━┛  ┏━┛┃ ┃┏━┃┏━┃  ┃");
        System.out.println("                                              ┛  ┃┃┃┏━┛┃  ┃  ┃ ┃┃┃┃┏━┛   ┃ ┃ ┃   ┃ ┏━┃┏━┛  ━━┃┏━┃┃ ┃┏━┛  ┛");
        System.out.println("                                              ┛  ━━┛━━┛━━┛━━┛━━┛┛┛┛━━┛   ┛ ━━┛   ┛ ┛ ┛━━┛  ━━┛┛ ┛━━┛┛    ┛");

        while (true) {
            System.out.print("                                                   ┏━───────────────────────────────────────────━┓");
            System.out.print("\n                                                               >> You have " + player.getBarya() + " barya.\n");
            System.out.println("                                                   ┗━───────────────────────────────────────────━┛");

            System.out.println("                                              Available items:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println("                                                  [" + (i + 1) + "] " + items.get(i));
            }
            System.out.println("                                                  Exit Shop");
            System.out.print("                                                                  Enter choice: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("                                                            ❌ Invalid input. Try again.\n");
                continue;
            }

            if (choice == 0) {
                System.out.println("                                                             >> You leave the shop. <<\n");
                break;
            }

            if (choice < 1 || choice > items.size()) {
                System.out.println("                                                            ❌ Invalid choice. Try again.\n");
                continue;
            }

            Item item = items.get(choice - 1);
            if (player.getBarya() < item.getPrice()) {
                System.out.println("                                                            ❌ You don’t have enough barya!\n");
            }
            // Simplified Logic: No more pet or pet food checks
            else if (item.getName().equals("Armor Upgrade")) {
                player.setBarya(player.getBarya() - item.getPrice());
                player.buyArmor();
            } else {
                player.setBarya(player.getBarya() - item.getPrice());
                player.addItem(item);
                System.out.println("                                                          ✅ You purchased " + item.getName() + "!\n");
            }
        }
    }
}