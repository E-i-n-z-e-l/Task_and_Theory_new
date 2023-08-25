package Isklyucheniya_v_programmirovanii.Practical_2.Task_2;
import java.util.Scanner;

/**
 Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
 Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
 с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
 */

public class Number_division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int numberTwo = scanner.nextInt();

        try {
            if (numberTwo == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            float answer = numberOne / numberTwo;
            System.out.println("Ответ: " + answer);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}
