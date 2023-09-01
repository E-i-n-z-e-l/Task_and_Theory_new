package Theory;

/**
 Создание двумерного массива - матрицы.
 */

import java.util.Arrays;

public class DvumernyyMassiv_10 {
    public static void main(String[] args) {
        String[][] matrix = new String[30][30];
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
