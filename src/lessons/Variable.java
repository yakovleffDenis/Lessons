package lessons;

public class Variable {
    public static void main(String [] args) {
        int myInt;
        myInt = 557;
        long myLong = 26246464;
        double myDouble = 235.35;
        float myFloat = 2362.4f;
        char c = 'a';
        byte x = 1;
        x+= (int)x; //x = x+x
        byte y = 1;
        boolean b = x!=y;
//        byte a = 12+(-1);
        byte myByte = 100; //-128 to 127
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(c);
        System.out.println(b);
        System.out.println(myByte);
//        System.out.println(a);


        int i = 29;
        char charValue = '\\';
        int d = (int) charValue+i;
        System.out.println((char) i);
    }

}
