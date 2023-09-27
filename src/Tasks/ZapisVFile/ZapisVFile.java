package Tasks.ZapisVFile;
import java.io.*;
/*
Программа на Java, которая будет принимать от пользователя через терминал строку и переносить её в созданный файл
 */

public class ZapisVFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку:");
            String input = reader.readLine();

            FileWriter writer = new FileWriter("fileOne.txt");
            writer.write(input);
            writer.close();

            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}