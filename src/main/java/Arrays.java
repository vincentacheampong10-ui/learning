import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];
        int sum = 0;
        int divide = 0;

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade" + (i + 1) + ":");
            grades[i] = scanner.nextInt();
        }

        System.out.println("The grades are:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i] + " ");

        } /// adding
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];

        }
        System.out.println("\nThe sum is: " + sum);


            double average = (double) sum / grades.length;
        System.out.println("Average grade: " + average);

        scanner.close();

        }
    }


