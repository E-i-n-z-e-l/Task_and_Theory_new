package ArkhitekturaPO.Practical04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVContactReader implements ContactReader{
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
