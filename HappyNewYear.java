import java.time.Year;
import java.util.Scanner;
import java.awt.Toolkit;

public class HappyNewYear {

    // Pause execution
    static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Clear console (works on most terminals)
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Beep sound
    static void beep() {
        Toolkit.getDefaultToolkit().beep();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int year = Year.now().getValue();

        // 🎯 Countdown
        for (int i = 5; i >= 1; i--) {
            clearScreen();
            beep();
            System.out.println("\n\n\t\t⏳ Countdown: " + i);
            pause(1000);
        }

        // 🎆 Fireworks animation
        String[] fireworks = {
            "            *",
            "        *       *",
            "    *       *       *",
            "        *       *",
            "            *"
        };

        for (int i = 0; i < 4; i++) {
            clearScreen();
            beep();
            for (String line : fireworks) {
                System.out.println("\n\t\t" + line);
            }
            pause(400);
        }

        // 🎊 Flashing Happy New Year message
        for (int i = 0; i < 6; i++) {
            clearScreen();
            if (i % 2 == 0) {
                System.out.println("\n\n\t🎉🎉 HAPPY NEW YEAR " + year + " 🎉🎉");
                System.out.println("\t\tDear " + name + ",");
                System.out.println("\t\tMay your code compile on first run 🚀");
            }
            pause(500);
        }

        // 🌟 Final Message
        clearScreen();
        System.out.println("\n\n\t✨ Welcome to " + year + " ✨");
        System.out.println("\t" + name + ", build skills, not excuses.");
        System.out.println("\tLess overthinking. More execution.");
        System.out.println("\n\t— A coder who shows up daily 💻🔥");

        sc.close();
    }
}
