package Tasks.MatematicTask;
import java.util.Scanner;
/*
Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.
*/
public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ребро куба: ");
        int edge = scanner.nextInt();

        int square = edge * edge;
        int volume = edge * edge * edge;

        System.out.printf("Площадь боковой поверхности куба: %d"
                            + "\nОбъем куба: %d", square, volume);
    }
}
