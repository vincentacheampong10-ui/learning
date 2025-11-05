package learning;

public class Main {
    public static void main(String[] args) {
         Person person1 = new Person();
        Person person2 = new Person();

         person1.name = "Vincent";
         person1.age = 23;
         person1.height = 179;

         person2.name= "Alice";
         person2.age = 32;
         person2.height =167;

       person1.introduce();
       person2.introduce();

       person1.compareAge(person2);


    }
}
