package Containerization.Practical_4;

import java.util.Scanner;

public class Conteyner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();

        int numberSum = numberOne + numberTwo;
        System.out.println("Сумма двух чисел равна: " + numberSum);

    }
}
