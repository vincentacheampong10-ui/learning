package learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a new BankAccount
        System.out.print("Enter account holder name:");
        String name = scanner.nextLine();

        System.out.print("Enter initial balance:");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, balance);
        System.out.println("\n✅ Account created successfully!");
        account.displayAccountInfo();

        // Step 2: Perform actions
        String choice = "";
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) View account info");
            System.out.println("Type 'exit' to quit");
            System.out.print("Choose:");
            choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.print("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case "2":
                    System.out.print("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case "3":
                    account.displayAccountInfo();
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}




