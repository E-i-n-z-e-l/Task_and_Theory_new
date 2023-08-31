package Tasks.ObkhodElementovVTsikle_Tasks;

import java.util.Arrays;

/**
5. Создайте одномерный массив символов размером 7 и заполните его значениями
'a', 'b', 'c', 'd', 'e', 'f', 'g'. Затем измените значение элемента с индексом 6 на 'z'.
 */
public class Task_5 {
    public static void main(String[] args) {
        char[] arrayFive = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println(Arrays.toString(arrayFive));
        arrayFive[6] = 'z';
        System.out.println(Arrays.toString(arrayFive));
    }
}
