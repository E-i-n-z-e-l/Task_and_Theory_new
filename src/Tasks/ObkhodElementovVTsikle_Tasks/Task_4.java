package Tasks.ObkhodElementovVTsikle_Tasks;

import java.util.Arrays;

/**
4. Создайте одномерный массив булевых значений размером 6 и заполните его значениями true и false
поочередно, начиная с true. Затем измените значение элемента с индексом 3 на false.
 */
public class Task_4 {
    public static void main(String[] args) {
        boolean[] arrayFour = {true, false, true, false, true, false};
        System.out.println(Arrays.toString(arrayFour));
        arrayFour[3] = false;
        System.out.println(Arrays.toString(arrayFour));
    }
}
