package app;
public class App {
    public static void main(String[] args) throws Exception {
        GameLogic.printHeading("Testing helper methods");
        GameLogic.waitForUser();
        GameLogic.clearConsole();
        int input = GameLogic.readInt("Enter 1, 2 or 3: ", 3);
        System.out.println("You chose number " + input);
    }
}
