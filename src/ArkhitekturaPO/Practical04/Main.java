package ArkhitekturaPO.Practical04;

import java.util.Scanner;

/**
 Проанализировав код, могу сказать следующее.
 Принципам SOLID, которым соответствует данный код:

 1. Принцип единственной ответственности (Single Responsibility Principle) - каждый класс отвечает только за свою
 задачу: Main - за взаимодействие с пользователем, CSVContactWriter - за запись контактов в CSV-файл,
 CSVContactReader - за чтение контактов из CSV-файла.

 2. Принцип открытости/закрытости (Open/Closed Principle) - классы CSVContactWriter и CSVContactReader
 закрыты для изменений, но открыты для расширения, т.е. их можно использовать для чтения/записи других форматов файлов.

 3. Принцип подстановки Барбары Лисков (Liskov Substitution Principle) - интерфейсы ContactWriter и ContactReader
 могут быть реализованы любыми классами, которые умеют записывать/читать контакты из файлов.

 Принципам SOLID, которым не соответствует данный код:

 1. Принцип инверсии зависимостей (Dependency Inversion Principle) - класс Main зависит от конкретных реализаций
 CSVContactWriter и CSVContactReader, а не от абстракций. Это может привести к проблемам при изменении
 или добавлении новых реализаций интерфейсов ContactWriter и ContactReader.
 */

public class Main {
    public static void main(String[] args) {
        Scanner numberscanner = new Scanner(System.in);
        ContactWriter writer = new CSVContactWriter("contacts.csv");
        ContactReader reader = new CSVContactReader();

        System.out.println("Чтобы внести новый контакт введите 1: \n" +
                "Чтобы посмотреть список контактов введите 2: ");
        int number =  numberscanner.nextInt();
        switch (number) {
            case 1:
                Scanner scanner = new Scanner(System.in);

                System.out.print("Введите имя: ");
                String name = scanner.nextLine();

                System.out.print("Введите фамилию: ");
                String surname = scanner.nextLine();

                System.out.print("Введите номер телефона: ");
                String phone = scanner.nextLine();

                writer.writeContact(name, surname, phone);
                break;
            case 2:
                reader.readContacts("contacts.csv");
                break;
            default:
                System.out.println("Введено неверное число");
        }
    }
}
