package ArkhitekturaPO.Practocal.Practical_3.DIP;

/**
 В этом примере есть интерфейс DataSource, предоставляющий метод getData().
 Классы Database и File реализуют этот интерфейс, предоставляя различные источники данных.
 Класс DataManager выполняет операции с данными и зависит от абстракции (DataSource), а не от конкретных реализаций.

 Пример демонстрирует принцип инверсии зависимостей (DIP), где класс DataManager зависит от абстракции (DataSource)
 вместо конкретных реализаций. Таким образом, мы разделили зависимости от абстракции и конфигурируемые компоненты
 от неконфигурируемых, что облегчает поддержку, тестирование и расширение программы.
 */

public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();

        DataSource database = new Database();
        dataManager.setDataSource(database);
        System.out.println(dataManager.fetchData());

        DataSource file = new File();
        dataManager.setDataSource(file);
        System.out.println(dataManager.fetchData());
    }
}
