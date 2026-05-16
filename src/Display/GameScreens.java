package Display;

import Storyline.DialogueUtils;

public class GameScreens {

    public static void displayGameOver() {
        System.out.println();
        System.out.println(ConsoleColors.RED + "                                             ▄████  ▄▄▄       ███▄ ▄███▓▓█████     ▒█████   ██▒   █▓▓█████  ██▀███  ");
        System.out.println("                                            ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀    ▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒");
        System.out.println("                                           ▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███      ▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒");
        System.out.println("                                           ░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄    ▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  ");
        System.out.println("                                           ░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒   ░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒");
        System.out.println("                                            ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░   ░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░");
        System.out.println("                                             ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░     ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░");
        System.out.println("                                           ░ ░   ░   ░   ▒   ░      ░      ░      ░ ░ ░ ▒       ░░     ░     ░░   ░ ");
        System.out.println("                                                 ░       ░  ░       ░      ░  ░       ░ ░        ░     ░  ░   ░     ");
        System.out.println("                                                              ░                                                        ");
        DialogueUtils.pause();
        System.out.println("                                               Your soul has departed from this world... darkness consumes you." + ConsoleColors.RESET);

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