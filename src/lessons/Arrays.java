package lessons;

public class Arrays {
    public static void main(String[] args) {
        int a = 10; //примитивный тип данных
//        char character = 'a'; //примитивный тип данных
//        String s = "Hello"; //or String s1 = new String("Hello"); ссылочные типы данных
//        int [] number = new int[5];//5 элементов в масиве 0,1,2,3,4
//        System.out.println(number[0]);  //0-й элемент
        int [] numbers = new int[5];   //numbers --> [масив]  ссылочные типы данных
        for (int i =0; i<numbers.length; i++){
            numbers[i] = i*10;
            System.out.println("i---> "+i);
            System.out.println("numbers---> "+numbers[i]);
        }
        System.out.println();
        int [] number1 = {1,2,5};
        for (int i=0; i<number1.length; i++){
            System.out.println(number1[i]);
        }
    }
}
