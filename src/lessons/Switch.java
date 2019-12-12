package lessons;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("You was born");
                break;
            case 7:
                System.out.println("You are going to school");
                break;
            case 18:
                System.out.println("You graduated school");
                break;
            default:
                System.out.println("nothing");
       }
    }
}
