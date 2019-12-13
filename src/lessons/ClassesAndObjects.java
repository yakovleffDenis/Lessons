package lessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
            person1.name = "John";
            person1.age = 30;
        Person person2 = new Person();
            person2.name = "Den";
            person2.age = 33;
        System.out.println("My name is " + person1.name +", " + "I'm "+ person1.age + " years old");
        System.out.println("My name is " + person2.name +", " + "I'm "+ person2.age + " years old");
    }
}

class Person {
    String name;
    int age;
}
