package lessons;

public class Continue {
    public static void main(String[] args) {
        for (int i=0; i<=15; i++){
            if (i%2==0){ //i делим на 2 с остатком 0. все целые числв 0,2,4...
                continue;
            } System.out.println("не четное число: " +i);//continue не выполняеться для 1,3,5...
        }
    }
}
