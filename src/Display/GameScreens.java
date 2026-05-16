package Display;

import Storyline.DialogueUtils;

public class GameScreens {

    public static void displayGameOver() {
        System.out.println("\n" + ConsoleColors.RED +
                "                                             ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n" +
                "                                             ┃                      💀 GAME OVER 💀                             ┃\n" +
                "                                             ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫\n" +
                "                                             ┃ Your soul has departed this world... darkness consumes you.      ┃\n" +
                "                                             ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛"
                + ConsoleColors.RESET);
        DialogueUtils.pause();
    }

    public static void displayRestartMenu() {
        System.out.println("\n" + ConsoleColors.YELLOW +
                "                                             ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n" +
                "                                             ┃                      🌟 WHAT NEXT? 🌟                            ┃\n" +
                "                                             ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫\n" +
                "                                             ┃ [1] Reincarnate: Begin a new quest.                              ┃\n" +
                "                                             ┃ [0] Exit: Return to reality.                                     ┃\n" +
                "                                             ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛"
                + ConsoleColors.RESET);
        System.out.print("                                             >> Choice: ");
    }
}