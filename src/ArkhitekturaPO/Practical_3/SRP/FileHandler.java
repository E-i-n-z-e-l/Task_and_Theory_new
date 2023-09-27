package ArkhitekturaPO.Practical_3.SRP;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
В этом примере есть класс FileHandler, который отвечает только за чтение и запись данных в файл.
Он имеет два метода: readFromFile, который читает данные из файла, и writeToFile, который записывает данные в файл.

Этот пример демонстрирует SRP, потому что ответственность за чтение и запись данных разделена между двумя
 методами внутри класса FileHandler. Это позволяет классу концентрироваться только на одной задаче и делает
 код более модульным, легким для чтения, понимания и поддержки.

 Если в будущем потребуется добавить новую функциональность, можно будет расширить класс FileHandler
 без изменения его существующих методов.
 */
public class FileHandler {
    public List<String> readFromFile(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        return Files.readAllLines(filePath);
    }

    public void writeToFile(String fileName, List<String> data) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String line : data) {
                writer.write(line + System.lineSeparator());
            }
        }
    }
}
