package Theory;
/*
Оценочные операторы "&& - и", "|| - или", "! - не"
*/
public class Otsenochnyye_operatory_1 {
    public static void main(String[] args) {

        boolean yes = true;
        boolean no = false;

        // Строки, содержащие проверки двух условий на их истинность

        System.out.println("Результат выражения yes и yes: " + (yes && yes));
        System.out.println("Результат выражения yes и no: " + (yes && no));

        // Строки для проверки, что одно из двух условий истинно

        System.out.println("Результат выражения yes или yes: " + (yes || yes));
        System.out.println("Результат выражения yes или no: " + (yes || no));
        System.out.println("Результат выражения no или no: " + (no || no));

        // Строки, показывающие первоначальное и противоположное значения логической переменной

        System.out.println( "Первоначальное значение переменной yes: " + yes );
        System.out.println( "Инвертированная переменная yes: " + !yes );

    }
}
