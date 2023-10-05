package ArkhitekturaPO.Practocal.Practical_3.LSP;

/**
 В этом примере есть абстрактный класс Animal, от которого наследуются классы Dog и Cat.
 У каждого класса есть своя реализация метода makeSound(), который выводит соответствующий звук.

 В методе main мы создаем экземпляры объектов Dog и Cat и передаем их в метод makeAnimalSound().
 Важно отметить, что метод makeAnimalSound() принимает объект типа Animal. Это демонстрирует,
 как потомки (классы-наследники) могут быть использованы вместо базового класса без изменения ожидаемого
 поведения программы.

 Таким образом, код программы демонстрирует применение принципа подстановки Барбары Лисков (LSP),
 где объекты классов-наследников могут быть использованы вместо объекта базового класса без изменения ожидаемого
 поведения программы.
 */

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        makeAnimalSound(dog);
        makeAnimalSound(cat);
    }

    public static void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }
}
