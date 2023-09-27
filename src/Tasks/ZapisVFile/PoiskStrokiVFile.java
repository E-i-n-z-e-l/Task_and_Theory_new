package Tasks.ZapisVFile;

import java.io.*;

public class PoiskStrokiVFile {
    public static void main(String[] args) {
        try {
            String searchStr = "егор"; // искомая строка
            FileReader reader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.toLowerCase().contains(searchStr.toLowerCase())) { // игнорируем регистр символов при поиске
                    System.out.println(line);
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
