package Tasks.SortirovkaMassiva;

import java.util.Arrays;

/**
 * 1. Отсортировать массив по возрастанию. Пузырьковая сортировка.
 */
public class Task_1 {
    public static void main(String[] args) {
        int[] arrayOne = {20, 5, 7, 6, 2, 8, 9, 1, 4, 10, 19, 15, 18, 16, 12, 17, 11, 13, 14, 3};
        for (int i = 0; i < arrayOne.length - 1; i++) {
            for (int j = 0; j < arrayOne.length - i - 1; j++) {
                if (arrayOne[j + 1] < arrayOne[j]) {
                    int temp = arrayOne[j + 1];
                    arrayOne[j + 1] = arrayOne[j];
                    arrayOne[j ] = temp;
                }
            }
            System.out.println(Arrays.toString(arrayOne));
        }
    }
}


