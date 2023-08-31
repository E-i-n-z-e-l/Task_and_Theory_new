package Tasks.ObkhodElementovVTsikle_Tasks;

import java.util.Arrays;

/**
 * 3. Создайте одномерный массив вещественных чисел размером 4 и заполните его значениями от 1.0 до 4.0.
  Затем увеличьте значение каждого элемента на 0.5.
 */
public class Task_3 {
    public static void main(String[] args) {
        double[] arrayTree = {1.0, 2.0, 3.0, 4.0};
        System.out.println(Arrays.toString(arrayTree));
        for (int i = 0; i < arrayTree.length; i++) {
            arrayTree[i] = arrayTree[i] + 0.5;
        }
        System.out.println(Arrays.toString(arrayTree));
    }
}
