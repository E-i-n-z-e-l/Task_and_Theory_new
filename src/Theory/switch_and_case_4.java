package Theory;
import java.util.Scanner;
/*
                                    Ветвление с помощью переключателей
 */
public class switch_and_case_4 {
    public static void main(String[] args) {

		/*
		Определяем сколько дней в Феврале(28 или 29 зависит от високосного года);
		*/

        int month = 2, year = 2016, num = 31;

        switch (month)
        {
            case 4 : case 6 : case 9 : case 11 :
            num = 30 ;
            break ;

            case 2 :
                num = ( year % 4 == 0 ) ? 29 : 28 ;
                break ;
        }

        System.out.println( month+"/"+year+": "+num+"дней" ) ;


//___________________________СЛЕДУЮЩИЙ ПРИМЕР С ВВОДОМ ПРОСТЫХ ЧИСЕЛ____________

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 4: ");

        int number =  scanner.nextInt();

        switch (number)
        {
            case 1:
                System.out.println("Введено число один ");
                break;

            case 2:
                System.out.println("Введено число два ");
                break;

            case 3:
                System.out.println("Введено число три ");
                break;

            case 4:
                System.out.println("Введено число четыре ");
                break;

            default:
                System.out.println("Введено неверное число");

        }
    }
}
