package Theory;
/*
Преобразование типов
 */
public class Preobrazovaniye_tipov_6 {
    public static void main(String[] args) {

        float daysFloat = 365.25f; // Создаем переменную типа float(дробь).
        String weeksString = "52"; // Создаем переменную типа String(строка).

        int daysInt = (int) daysFloat; // Создаем новую переменную daysInt преобразовывая Float в Int.
        int weeksInt = Integer.parseInt(weeksString); // Из строковой переменной создаем целочисленную.

        int week = (daysInt / weeksInt); // Делим две переменные типа Int чтобы узнать сколько дней в неделе.
        System.out.println("Дней в неделе: " + week);
    }
}
