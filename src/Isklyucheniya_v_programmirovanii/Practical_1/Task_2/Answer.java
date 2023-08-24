package Isklyucheniya_v_programmirovanii.Practical_1.Task_2;

/**
 Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
 и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов
 в той же ячейке.


 Если длины массивов не равны - верните нулевой массив длины 1.
 Важно: При выполнении метода единственное исключение, которое пользователь
 может увидеть - RuntimeException, т.е. ваше.

 Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:

 int[] a - первый массив
 int[] b - второй массив

 a = new int[]{12, 8, 16};
 b = new int[]{4, 2, 4};

 Вывод: [3, 4, 4]

 a = new int[]{12, 8, 16, 25};
 b = new int[]{4, 2, 4};

 Вывод: [0]
 */
public class Answer {
    public int[] subArrays(int[] a, int[] b){

        int[] c;

        if (a.length != b.length) {
            c = new int[]{0};
        }
        else {
            c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
        }
        return c;
    }
}
