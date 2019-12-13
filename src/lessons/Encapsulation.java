package lessons;

public class Encapsulation {
    public static void main(String[] args) {
        NewPerson person1 = new NewPerson();
        person1.setName("");
        person1.setAge(-4);
        System.out.println("Выводим значение в main методе " + person1.getName());
        System.out.println("Выводим значение в main методе " + person1.getAge());
    }
}

class NewPerson {
    private String name;
    private int age;

    public void setName(String userName) {
        if(userName.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge<0){
            System.out.println("Возраст должен быть положительный");
        }else{
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void speak() {
        for (int i = 0; i < 1; i++) {
            System.out.println("My name is " + name + "," + " I'm " + age + " years old");
        }
    }
}

