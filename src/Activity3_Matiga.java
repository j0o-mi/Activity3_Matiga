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

        // Display the Menu for the user.
        System.out.println("=== Snack Menu ===");
        SnackMenu();

        // Scanner - use to ask the user what the order is.
        System.out.print("\nWhat would you like to order? ");
        String choice = sc.nextLine();

        // Conditional Statement - used Switch Statement to print the output.
        switch (choice.toLowerCase()) {
            case "burger":
                burgerPrice = 50;
                System.out.println("\n=== Snack Receipt ====");
                System.out.println("You have chosen: " + choice);
                System.out.printf("Price: ₱%d%n", burgerPrice);  // print here
                break;
            case "fries":
                friesPrice = 40;
                System.out.println("\n=== Snack Receipt ====");
                System.out.println("You have chosen: " + choice);
                System.out.printf("Price: ₱%d%n", friesPrice);   // print here
                break;
            case "soda":
                sodaPrice = 20;
                System.out.println("\n=== Snack Receipt ====");
                System.out.println("You have chosen: " + choice);
                System.out.printf("Price: ₱%d%n", sodaPrice);    // print here
                break;
            case "ice cream":
                iceCreamPrice = 35;
                System.out.println("\n=== Snack Receipt ====");
                System.out.println("You have chosen: " + choice);
                System.out.printf("Price: ₱%d%n", iceCreamPrice); // print here
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    // Snack Menu Method - Reusable Data for printing the Snack Menu.
    static void SnackMenu() {
        System.out.println("1. Burger - ₱50");
        System.out.println("2. Fries - ₱40");
        System.out.println("3. Soda - ₱20");
        System.out.println("4. Ice Cream - ₱35");
    }
}
