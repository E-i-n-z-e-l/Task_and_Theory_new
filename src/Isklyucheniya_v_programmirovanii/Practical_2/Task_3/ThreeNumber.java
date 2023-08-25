package Isklyucheniya_v_programmirovanii.Practical_2.Task_3;

import java.util.Scanner;

/**
 Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

 Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением
 "Первое число вне допустимого диапазона".

 Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением
 "Второе число вне допустимого диапазона".

 Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением
 "Сумма первого и второго чисел слишком мала".

 Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением
 "Деление на ноль недопустимо".

 В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".

 - необходимо создать 3 класса собвстенных исключений
 */

public class ThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int numberThree = scanner.nextInt();

        try {
            if (numberOne > 100 ) {
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            }
            System.out.println("Проверка пройдена успешно");
        }
            catch (NumberOutOfRangeException e){
                System.out.println(e.getMessage());
            }

        try {
            if (numberTwo < 0) {
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            }
            System.out.println("Проверка пройдена успешно");
        }
        catch (NumberOutOfRangeException e){
            System.out.println(e.getMessage());
        }

        try {
            if (numberOne + numberTwo < 10) {
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }
            System.out.println("Проверка пройдена успешно");
        }
        catch (NumberSumException e){
            System.out.println(e.getMessage());
        }

        try {
            if (numberThree == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            System.out.println("Проверка пройдена успешно");
        }
        catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
    }

    static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }

    static class NumberSumException extends Exception {
        public NumberSumException (String message) {
            super(message);
        }
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}
