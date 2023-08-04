package Theory;
/*
                                        Управляющие литералы

Управляющий символ 		Описание


	\n 			        Перевод строки
	\t 			        Табуляция
	\b 			        Шаг назад (забой)
	\r 			        Возврат каретки
	\f 			        Перевод страницы
	\\ 			        Обратный слеш
	\' 			        Одиночная кавычка (апостроф)
	\" 			        Двойная кавычка
 */
public class Upravlyayushchiye_literaly_3 {
    public static void main(String[] args) {

        String header = "\n\tНЬЮ-ЙОРК ПРОГНОЗ НА 3 ДНЯ:\n";
        header += "\n\tДень\t\tМакс\tМин\t\tОсадки\n";
        header += "\t---\t\t\t----\t---\t\t----------\n";

        String forecast = "\tВоскресенье\t68F\t\t48F\t\tЯсно\n";
        forecast += "\tПонедельник\t69F\t\t57F\t\tЯсно\n";
        forecast += "\tВторник\t\t71F\t\t50F\t\tОблачность\n";

        System.out.print( header + forecast );
    }
}
