package lessons;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println("1 - element" + numbers[1]);
        /**
         * 123
         * 456 5 - [1] [1]
         * 789
         */
        int [][] matrice = {{1,2,3,4,5},
                            {4},
                            {7,8,9,0}};
        int sum = matrice[2][2]+matrice[1][0];
        System.out.println("9-element = " + matrice[2][2]);//9
        System.out.println("4-element = " + matrice[1][0]); //4
        System.out.println("They sum is = " + sum);//9+4
        System.out.println();

        for (int i=0; i<matrice.length; i++) {
            for (int j=0; j<matrice[i].length;j++){
                System.out.print(matrice[i][j] +" ");
            }
           System.out.println();
        }
        System.out.println();
        int [] numbers1 = new int[5];
        String [][] text = new String[2][3];
        text [0][1] = "Hello";
        System.out.println(text[0][1]);
    }
}
