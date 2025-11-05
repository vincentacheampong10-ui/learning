package learning;

public class Method {
    public static void main(String[] args) {
        sayHello();
        greet("Vincent");

        int sum = add(10, 5);
        System.out.println("The sum is: " + sum);
    }

    public static void sayHello() {
        System.out.println("Hello there!");
    }

    public static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
