package lessons;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);
        /**
         * 123
         * 456 5 - [1] [1]
         * 789
         */
        int [][] matrice = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        System.out.println(matrice[2][2]);//9
        System.out.println(matrice[1][0]); //4
    }
}
