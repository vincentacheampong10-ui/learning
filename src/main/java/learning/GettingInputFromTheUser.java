package learning;

import java.util.Scanner;

public class GettingInputFromTheUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String again = "yes";

        while (again.equalsIgnoreCase("yes")) {

            System.out.print("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("What operation would you like to perform?:");
            System.out.println("1) for addition");
            System.out.println("2) for subtraction");
            System.out.println("3) for multiplication");
            System.out.println("4) for division");
            System.out.print("Choose one:");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Result: " + addition(num1, num2));
                    break;
                case 2:
                    System.out.println("Result:" + subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Result:" + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result:" + divide(num1, num2));

                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println("Would you like to perform another calculation? (yes/no)");
            again = scanner.next();

        }

        scanner.close();
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; // means “Not a Number”
        }
        return a / b;
    }
}


