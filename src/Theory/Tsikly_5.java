package Theory;
/*
                                            Циклы do-while


Главное отличие цикла do-while от всех остальных, что условие будет выполнено в первый раз в любом случае,
не зависимо верно оно или нет.
*/

public class Tsikly_5 {
    public static void main(String[] args) {

        int num = 100;

        do
        {
            System.out.println( "Используем Do-While: " + num );
            num -= 10 ;
        } while ( num > 100);

        /*
                        Вывод в терминале будет таким:
                        Используем Do-While: 100
*/
        //                          Оператор Continue

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
/*
        Оператор Continue в этом примере когда i = 5, не будет его печатать, а просто пропустит.
        Остальные числа он выведит в терминал.
*/
    }
}



