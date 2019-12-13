package lessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
            person1.name = "John";
            person1.age = 30;
            person1.sayHello();
            person1.speak();
        Person person2 = new Person();
            person2.name = "Den";
            person2.age = 33;
            person2.speak();
    }
}

class Person {
    String name;
    int age;
    void speak() {
//        for (int i = 0; i < 3; i++) {
            System.out.println("My name is" + name + "," + " I'm " + age + " years old");
//        }
        System.out.println();

    }
        void sayHello(){
            System.out.print("Hello"+","+" ");
        }
    }