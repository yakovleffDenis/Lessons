package lessons;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 10;
        System.out.println(num[0]); //первый =10
        System.out.println(num[1]); //первый = пустой
        String [] text = new String[3];
        text[0] = "Hello";
        text[1] = "Goodbye";
        text[2] = "Java";
        System.out.println(text[0]+" "+text[1]);
        System.out.println(text[2]);
    }
}