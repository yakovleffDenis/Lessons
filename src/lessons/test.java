package lessons;

public class test {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3, 4, 5},
                {4},
                {7, 8, 9, 0}};
        for (int i = 0; i < matrice.length; i++) {
                  //System.out.println("Количество элементов в "+ (i+1) +"-строке " + matrice[i].length);
            System.out.println(String.format("Количество элементов в %d-строке %d", i+1, matrice[i].length));
            }
        //}
    }
}
