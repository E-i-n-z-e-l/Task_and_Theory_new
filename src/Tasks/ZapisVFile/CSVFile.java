package Tasks.ZapisVFile;
import java.io.*;
import java.util.Scanner;

public class CSVFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Введите номер телефона: ");
        String phone = scanner.nextLine();

        String csvFile = "contacts.csv";
        FileWriter writer = null;

        try {
            writer = new FileWriter(csvFile, true);
            // записываем заголовок, если файл пустой
            if (new File(csvFile).length() == 0) {
                writer.write("Имя,\t\t\tФамилия,\t\t\tТелефон\n");
            }

            writer.append(name + ",\t\t" + surname + ",\t\t" + phone + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Данные успешно записаны в файл.");
        readCSVFile("contacts.csv");
    }
    public static void readCSVFile(String csvFile) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(csvFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
