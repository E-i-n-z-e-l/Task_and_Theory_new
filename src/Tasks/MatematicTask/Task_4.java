package Tasks.MatematicTask;
import java.util.Scanner;
/*
Даны два действительных положительных числа.
Найти среднее арифметическое и среднее геометрическое
этих чисел.

%d - целые числа;
%f - дробные числа;
*/
public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое положительное действительное число: ");
        double numberOne = scanner.nextDouble();

        System.out.println("Введите второе положительное действительное число: ");
        double numberTwo = scanner.nextDouble();

        double average = (numberOne + numberTwo) / 2;
        System.out.printf("Среднее арифметическое этих чисел равно: %f", average);

        double multiplicity = numberOne * numberTwo;
        double geometricMean = Math.sqrt(multiplicity);

        System.out.printf("\nСреднее геометрическое этих чисел равно: %f", geometricMean);
    }
}
