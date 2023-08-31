package Tasks.ObkhodElementovVTsikle_Tasks;

import java.util.Arrays;

/**
 1. Создайте одномерный массив целых чисел размером 5 и заполните его значениями от 1 до 5.
 Затем измените значение элемента с индексом 2 на 10.
 */
public class Task_1 {
    public static void main(String[] args) {
        int[] arrayOne = new int[5];
        System.out.println(Arrays.toString(arrayOne));
        arrayOne[2] = 10;
        System.out.println(Arrays.toString(arrayOne));
    }
}
