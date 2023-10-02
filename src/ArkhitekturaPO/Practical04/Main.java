package ArkhitekturaPO.Practical04;

import java.util.Scanner;

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
