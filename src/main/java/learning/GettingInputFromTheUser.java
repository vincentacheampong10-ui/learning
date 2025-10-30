package learning;

import java.util.Scanner;

public class GettingInputFromTheUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
                System.out.println("Result:"+ ( num1 + num2));
                break;
            case 2:
                System.out.println("Result:" +( num1 - num2));
                break;
            case 3:
                System.out.println("Result:"+ (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                } else {
                    System.out.println("Result:"+ (num1 / num2));
                }
                break;
        }
        scanner.close();



    }
}
