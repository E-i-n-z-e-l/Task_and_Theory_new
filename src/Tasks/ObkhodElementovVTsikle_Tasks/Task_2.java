package Tasks.ObkhodElementovVTsikle_Tasks;

import java.util.Arrays;

/**
 * 2. Создайте одномерный массив строк размером 3 и заполните его значениями "один", "два", "три".
 * Затем измените значение элемента с индексом 1 на "двадцать".
 */
public class Task_2 {
    public static void main(String[] args) {
        String[] arrayTwo = {"один", "два", "три"};
        System.out.println(Arrays.toString(arrayTwo));
        arrayTwo[1] = "двадцать";
        System.out.println(Arrays.toString(arrayTwo));
    }
}
