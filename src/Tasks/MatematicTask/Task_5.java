package Tasks.MatematicTask;
import java.util.Scanner;
/*
Даны два действительных числа. Найти среднее
арифметическое этих чисел и среднее геометрическое их
модулей.
*/

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое действительное число: ");
        double numberOne = scanner.nextDouble();

        System.out.println("Введите второе действительное число: ");
        double numberTwo = scanner.nextDouble();

        double average = (numberOne + numberTwo) / 2;
        System.out.printf("Среднее арифметическое этих чисел равно: %f\n", average);

        double modulNumberOne = Math.abs(numberOne);
        double modulNumberTwo = Math.abs(numberTwo);

        double multiplicity = modulNumberOne * modulNumberTwo;

        double modulGeometricMean = Math.sqrt(multiplicity);

        System.out.printf("Cреднее геометрическое модулей этих чисел равно: %f", modulGeometricMean);
    }
}
