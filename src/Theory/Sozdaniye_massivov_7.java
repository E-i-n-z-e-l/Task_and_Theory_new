package Theory;
/*
Создание массивов переменных
 */
public class Sozdaniye_massivov_7 {
    public static void main(String[] args) {
        String[] str = {"Java ", "Хороший", " Язык"}; // Создаем строчный массив.
        str[1] = "Лучший"; // Меняем второй элемент массива.

        int[] num = new int[3]; // Создаем целочисленный массив.
        num[0] = 100; // Указываем первый элемент массива.
        num[1] = 200; // Указываем второй элемент массива.

        System.out.println( "Размер строкового массива " + str.length ); // Указываем размеры массивов.
        System.out.println( "Размер целочисленного массива "+ num.length);

        System.out.println( num[0] + ", " +num[1]+ ", "+num[2] );
        System.out.println( str[0] + str[1] + str[2] );

    }
}
