package Display;

public class DisplayUtils {
    public static void printCriticalBanner() {

        System.out.println(ConsoleColors.YELLOW + "      ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
        System.out.println("      █▀▀ █▀█ █ ▀█▀ █ █▀▀ ▄▀█ █░░ █ █");
        System.out.println("      █▄▄ █▀▄ █ ░█░ █ █▄▄ █▀█ █▄▄ ▄ ▄");
        System.out.println("      ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★  " + ConsoleColors.RESET);

    }

    public static void type(String message, int delay) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try { Thread.sleep(delay); } catch (InterruptedException e) {}
        }
        System.out.println();
    }
}
