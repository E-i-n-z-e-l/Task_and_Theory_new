package ArkhitekturaPO.Practocal.Practical06.Facade;
/*
Паттерн Фасад (Facade) относится к структурным паттернам проектирования и позволяет создать упрощенный интерфейс
для сложной системы. Он используется, когда нужно скрыть сложность системы и предоставить простой интерфейс
для взаимодействия с ней.

Примером использования паттерна Фасад может быть создание библиотеки для работы с базой данных.
В этом случае сложная система – это база данных, а упрощенный интерфейс – это библиотека.

В данном примере класс Database представляет сложную систему – базу данных.
Класс DatabaseFacade представляет упрощенный интерфейс для взаимодействия с базой данных.
Методы connect() и disconnect() в классе DatabaseFacade представляют методы для подключения и отключения от базы данных.
Метод executeQuery(String query) в классе DatabaseFacade представляет метод для выполнения запросов к базе данных.

При создании объекта класса DatabaseFacade мы создаем объект класса Database, который представляет сложную
систему – базу данных. При вызове метода executeQuery(String query) для объекта класса DatabaseFacade сначала
вызывается метод connect() для подключения к базе данных, затем вызывается метод executeQuery(String query)
для выполнения запроса, а после этого вызывается метод disconnect() для отключения от базы данных.
 */
class Database {
    public void connect() {
        System.out.println("Connect to database");
    }

    public void disconnect() {
        System.out.println("Disconnect from database");
    }

    public void executeQuery(String query) {
        System.out.println("Execute query: " + query);
    }
}

class DatabaseFacade {
    private Database database;

    public DatabaseFacade() {
        this.database = new Database();
    }

    public void connect() {
        database.connect();
    }

    public void disconnect() {
        database.disconnect();
    }

    public void executeQuery(String query) {
        connect();
        database.executeQuery(query);
        disconnect();
    }
}

public class Facade {
    public static void main(String[] args) {
        DatabaseFacade facade = new DatabaseFacade();
        facade.executeQuery("SELECT * FROM users");
    }
}
