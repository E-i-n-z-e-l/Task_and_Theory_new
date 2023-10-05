package ArkhitekturaPO.Practocal.Practical04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVContactReader implements ContactReader{
    /**
     * <p>
     *     Метод readContacts: читает контакты из файла и выводит их на экран. Принимает имя файла.
     * <p>
     * @return Метод readContacts не возвращает значения (void).
     * @pre Для работы метода readContacts является передача корректного имени файла.
     * @post Успешное чтение контактов из файла и вывод на экран.
     * @param csvFile
     */
    @Override
    public void readContacts(String csvFile) {
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
