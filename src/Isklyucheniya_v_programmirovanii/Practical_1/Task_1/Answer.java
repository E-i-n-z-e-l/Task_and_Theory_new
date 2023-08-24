package Isklyucheniya_v_programmirovanii.Practical_1.Task_1;

class Answer {

    /**
     Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
     */
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[5];
        arr[10] = 5;

    }

    /**
     Метод divisionByZero - Деление на 0
     */
    public static void divisionByZero() {
        int a = 5;
        int b = 0;
        int c = a / b;

    }

    /**
     Метод numberFormatException - Ошибка преобразования строки в число
     */
    public static void numberFormatException() {
        String str = "abc";
        int num = Integer.parseInt(str);

    }
}
