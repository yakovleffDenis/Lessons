package lessons;

public class test {
    public static void main(String[] args) {
        int [][] matrice = {{1,2,3,4,5},
                {4},
                {7,8,9,0}};
        for (int i=0; i<matrice.length; i++) {
            for (int j=0; j<matrice[i].length;j++){
                System.out.println("Количество элементов в 1-строке"+ matrice[i]);
                System.out.print(matrice[i][j] +" ");
            }
            System.out.println();
        }
    }
}
