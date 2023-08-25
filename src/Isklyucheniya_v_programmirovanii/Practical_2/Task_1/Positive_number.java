package Isklyucheniya_v_programmirovanii.Practical_2.Task_1;
import java.util.Scanner;

/**
 Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
 Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
 с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".
 */


public class Positive_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        try {
            if (number <= 0) {
                throw new InvalidNumberException("Некорректное число");
            }
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }
}
