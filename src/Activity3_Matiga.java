import java.util.Scanner;

public class Activity3_Matiga {
    public static void main(String[] args) {
        /*
        Problem Scenario:
        You are making a simple menu-driven program for a snack shop.
        The user selects a menu number, and the program will display the corresponding snack name and price.

        Menu:
        1 → Burger – ₱50
        2 → Fries – ₱40
        3 → Soda – ₱20
        4 → Ice Cream – ₱35

        If the user enters a number that’s not in the menu, display "Invalid choice".
         */
        Scanner sc = new Scanner(System.in);

        // Declaration of Variables - Item/Snack Prices
        int burgerPrice = 0;
        int friesPrice = 0;
        int sodaPrice = 0;
        int iceCreamPrice = 0;

        System.out.println("=== Snack Menu ===");
        SnackMenu();

        System.out.println("\nWhat would you like to order? ");
        System.out.print("Choose between item's 1-4: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                burgerPrice = 50;
                break;
            case "2":
                friesPrice = 40;
                break;
            case "3":
                sodaPrice = 20;
                break;
            case "4":
                iceCreamPrice = 35;
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        System.out.println("Hello World");
    }

    // Snack Menu Method - Reusable Data for printing the Snack Menu.
    static void SnackMenu() {
        System.out.println("1. Burger - ₱50");
        System.out.println("2. Fries - ₱40");
        System.out.println("3. Soda - ₱20");
        System.out.println("4. Ice Cream - ₱35");
    }
}
