package lessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
            person1.setName("John");
            person1.age = 50;
            String s1 = "Den";
        Person person2 = new Person();
            person2.setName(s1);
            person2.age = 20;
            person1.sayHello();
            person1.speak();
            person2.speak();
    }
}

class Person {
    String name;
    int age;

    void setName(String username){
        name = username;
    }

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