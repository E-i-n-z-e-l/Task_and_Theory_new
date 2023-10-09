package ArkhitekturaPO.Practocal.Practical06.Proxy;

/*
Паттерн Заместитель (Proxy) относится к структурным паттернам проектирования и используется для создания
объекта-заместителя, который выступает вместо реального объекта. Заместитель может выполнять дополнительные
функции, например, кэширование результатов работы реального объекта, проверку доступа к объекту и т.д.

Примером использования паттерна Заместитель может быть загрузка изображений в браузере.
В этом случае реальный объект – изображение – может занимать много места в памяти и загружаться долго.
Для ускорения загрузки изображения можно использовать объект-заместитель, который будет загружать изображение
только при первом обращении к нему, а затем сохранять его в кэше.

В данном примере интерфейс Image представляет изображение. Класс RealImage представляет реальное изображение,
которое загружается из файла при создании объекта. Класс ProxyImage представляет объект-заместитель,
который загружает реальное изображение только при первом обращении к нему.

При создании объекта класса ProxyImage мы передаем ему имя файла. Метод display() проверяет, было ли реальное
изображение уже загружено. Если нет, то метод создает объект класса RealImage и загружает изображение из файла.
Затем метод вызывает метод display() у объекта класса RealImage.
 */

interface Image {
    void display();
}

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

public class Proxy {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        image1.display();
        image1.display();
        image2.display();
        image2.display();
    }
}
