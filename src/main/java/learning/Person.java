package learning;

public class Person {
    String name;
    int age;
    double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void introduce() {
        System.out.println("Hi, my name is " + name + ".");
        System.out.println("I am " + age + " years old and " + height + " cm tall.");
    }

    void birthday() {
        age += 1;
        System.out.println("Happy birthday, " + name + "! You are now " + age + " years old.");
    }

    void compareAge(Person otherPerson) {
        if (this.age > otherPerson.age) {
            System.out.println(name + " is older than " + otherPerson.name + ".");
        } else if (this.age < otherPerson.age) {
            System.out.println(name + " is younger than " + otherPerson.name + ".");
        } else {
            System.out.println(name + " and " + otherPerson.name + " are the same age!");
        }
    }
}


