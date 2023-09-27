package Tasks.ZapisVFile;
import java.io.*;
public class DoZapisVFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку:");
            String input = reader.readLine();

            FileWriter writer = new FileWriter("file.txt", true);
            writer.write("\n" + input);
            writer.close();

            System.out.println("Строка успешно добавлена в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
