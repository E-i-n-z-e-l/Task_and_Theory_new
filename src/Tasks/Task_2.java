package Tasks;
import java.util.Scanner;
/*
	Даны действительные числа X и Y. Получить: (|x| - |y|)  /  (1 + (|x| * |y|))

	Теория:
	В программировании на языке Java для вычисления модуля числа используется
	метод Math.abs(). Скобки || не используются для вычисления модуля числа в Java.

	Вот пример использования метода Math.abs() для вычисления модуля числа:

	int x = -5;
	int y = 3;

	int result = Math.abs(x) + Math.abs(y);

	System.out.println(result); // Выводит 8

	В этом примере мы используем метод Math.abs() для вычисления модуля чисел x и y,
	а затем складываем их значения. Результат будет равен 8.
	*/
public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите X: ");
        float numberX =  scanner.nextFloat();

        System.out.println("Введите Y: ");
        float numberY =  scanner.nextFloat();

        float answer = (Math.abs(numberX) - Math.abs(numberY)) / (1 + (Math.abs(numberX) * Math.abs(numberY)));

        System.out.println("\n" + "Ответ: " + answer);
    }
}
