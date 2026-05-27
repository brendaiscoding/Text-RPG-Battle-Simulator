package app;
import java.util.Scanner;

public class GameLogic {
    static Scanner scan = new Scanner(System.in);

    //Method that gets the user input and checks if it's valid
    public static int readInt(String prompt, int userChoises) {
        int input;

        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scan.nextLine());
            } catch (Exception e) {
                input = -1;
                System.out.println("Invalid input. Please enter an integer number.");
            }
        } while (input < 1 || input > userChoises);
        return input;
    }

    //Method to simulate clearing out the console
    public static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    //Method to print a separator with length n
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    //Method to print a heading
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    //Method to stop the game until the user presses enter
    public static void waitForUser() {
        System.out.println("\nPress Enter to continue...");
        scan.nextLine();
    }
}