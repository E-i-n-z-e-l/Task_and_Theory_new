package Theory;
/*
Передача аргументов
 */
public class Peredacha_argumentov_8 {
    // String[] args сам по себе уже является массивом строк без данных.
    public static void main(String[] args) {

        String [] array = {"-en", "-es", "-ru"};
        // Здесь мы сравниваем значения с помощью equals.
        if (array.length == 0) {
            System.out.println("Нет аргументов");
        }

        else if (array[0].equals("-en")) {
            System.out.println("Опция для Английского языка");
        }

        else if (array[0].equals("-es")) {
            System.out.println("Опция для Испанского языка");
        }

        else System.out.println("Неизвестная опция");

       // ------------------------------------------------------------------------------------------
        /*
                            Передача множества аргументов
        */

        String [] arrayNew = {"10", "/", "2"};
        if (arrayNew.length != 3) {
            System.out.println("Неверное число аргументов");
            return;
        }

        int num1 = Integer.parseInt(arrayNew[0]);
        int num2 = Integer.parseInt(arrayNew[2]);

        String msg = arrayNew[0] + " " + arrayNew[1] + " " + arrayNew[2] + " = ";

        if (arrayNew[1].equals("+")) {
            msg += (num1 + num2);
        }
        else if (arrayNew[1].equals("-")) {
            msg += (num1 - num2);
        }
        else if (arrayNew[1].equals("*")) {
            msg += (num1 * num2);
        }
        else if (arrayNew[1].equals("/")) {
            msg += (num1 / num2);
        }
        else msg = "Неправильный оператор";

        System.out.println(msg);


    }
}
