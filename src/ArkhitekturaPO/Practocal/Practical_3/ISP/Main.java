package ArkhitekturaPO.Practocal.Practical_3.ISP;

/**
 В этом примере есть интерфейсы Printer и Scanner, которые предоставляют методы print() и scan() соответственно.
 Классы SimplePrinter и SimpleScanner реализуют только один интерфейс, соответствующий их функциональности.
 Класс MultiFunctionDevice реализует оба интерфейса, предоставляя возможность печати и сканирования.

 Пример демонстрирует принцип разделения интерфейса (ISP). Вместо создания всесторонних интерфейсов,
 мы разделили их на более специализированные "маленькие" интерфейсы. Таким образом, классы могут реализовывать
 только те методы, которые им необходимы, избегая зависимости от неиспользуемых методов.
 */

public class Main {
    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        Scanner scanner = new SimpleScanner();

        printer.print();
        scanner.scan();

        Printer multiFunctionPrinter = new MultiFunctionDevice();
        Scanner multiFunctionScanner = new MultiFunctionDevice();

        multiFunctionPrinter.print();
        multiFunctionScanner.scan();
    }
}
