package lessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
            person1.name = "John";
            person1.age = 50;
            person1.sayHello();
            person1.speak();

        Person person2 = new Person();
            person2.name = "Den";
            person2.age = 20;
            person2.speak();
            int year2 = person2.calculateYearsToRetirement();
        System.out.println("Person 2 to retirement is " + year2 + " years");
    }
}

class Person {
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 1; i++) {
            System.out.println("My name is " + name + "," + " I'm " + age + " years old");
        }
//        System.out.println();
    }

    void sayHello() {
        System.out.println("Hello" + "," + " ");
    }
}