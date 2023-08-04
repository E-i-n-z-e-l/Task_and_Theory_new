package Theory;
/*
                                    Условные операторы
*/
public class Uslovnyye_operatory_2 {

    /*
	"?" - если
	*/

    public static void main(String[] args) {

        int num1 = 1357;
        int num2 = 2468;

        String result;

        result = ( num1 % 2 != 0 ) ? "Нечетное" : "Четное";
        System.out.println( num1 + " - " + result );

        result = ( num2 % 2 != 0 ) ? " Нечетное " : " Четное ";
        System.out.println( num2 + " - " + result );

		/*
		"?" - это знакомый нам if.
		Первый пример по простому звучит так -
		"Если остаток от деления на 2 не равен 0, то переменная num1 Нечетное,
		если равен 0, то четное."
		Первое условие это "Да", второе условие "Нет".
		*/
    }
}
