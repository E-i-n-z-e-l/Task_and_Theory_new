package ArkhitekturaPO.Practocal.Practical06.Bridge;

/*
Паттерн Мост (Bridge) относится к структурным паттернам проектирования и позволяет отделить абстракцию от ее реализации.
Он используется, когда нужно изменять или расширять функциональность класса без изменения его интерфейса.

Примером использования паттерна Мост может быть создание графического интерфейса для ОС.
В этом случае абстракция – это графический интерфейс, а реализация – это код для каждой операционной системы.

В данном примере интерфейс Implementor представляет реализацию, а класс Abstraction – абстракцию.
Классы ConcreteImplementorA и ConcreteImplementorB представляют конкретные реализации.
Метод operationImplementation() в классах ConcreteImplementorA и ConcreteImplementorB реализует конкретную
функциональность для каждой реализации.

При создании объектов класса Abstraction мы передаем в него объекты классов ConcreteImplementorA и ConcreteImplementorB,
которые представляют конкретные реализации. При вызове метода operation() для каждого объекта класса Abstraction
вызывается соответствующий метод operationImplementation() для конкретной реализации.
 */

interface Implementor {
    void operationImplementation();
}

class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImplementation();
    }
}

class ConcreteImplementorA implements Implementor {
    public void operationImplementation() {
        System.out.println("Готово");
    }
}

class ConcreteImplementorB implements Implementor {
    public void operationImplementation() {
        System.out.println("Готово 2");
    }
}

public class Bridge {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstractionA = new Abstraction(implementorA);
        abstractionA.operation(); // Output: ConcreteImplementorA operation

        Abstraction abstractionB = new Abstraction(implementorB);
        abstractionB.operation(); // Output: ConcreteImplementorB operation
    }
}
