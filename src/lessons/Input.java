package lessons;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.println("Enter something");
        String inputedText = s.nextLine();
        System.out.println("Entered text is: "+inputedText);
        }
    }