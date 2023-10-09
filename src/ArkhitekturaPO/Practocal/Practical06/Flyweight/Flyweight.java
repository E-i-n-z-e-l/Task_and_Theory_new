package ArkhitekturaPO.Practocal.Practical06.Flyweight;

/*
Паттерн Легковес (Flyweight) относится к структурным паттернам проектирования и используется для оптимизации работы
с большим количеством мелких объектов. Он позволяет разделить объекты на две части: интринсическую (внутреннюю) и
экстринсическую (внешнюю). Интринсическая часть содержит данные, которые являются общими для всех объектов класса,
а экстринсическая часть содержит данные, которые различают объекты друг от друга.

Примером использования паттерна Легковес может быть создание текстового редактора. В этом случае мелкими объектами
будут символы, а интринсической частью будут являться стили символов (например, шрифт, цвет), которые будут общими
для всех символов с определенным стилем.

В данном примере класс Character представляет мелкий объект – символ. Класс CharacterStyle представляет интринсическую
часть – стиль символа. Класс CharacterFactory представляет фабрику символов, которая создает символы с определенным
стилем.

При создании объекта класса Character мы передаем ему символ и стиль.
Метод draw() выводит информацию о символе и его стиле.

При создании объекта класса CharacterFactory мы создаем пустой словарь characters,
который будет хранить символы с определенным стилем. Метод getCharacter(char symbol, CharacterStyle style)
возвращает символ с определенным стилем. Если символ с таким стилем уже был создан ранее, то метод вернет
его из словаря. Если символ с таким стилем еще не был создан, то метод создаст новый символ и добавит его в словарь.
 */

import java.util.HashMap;
import java.util.Map;

class CharacterStyle {
    private String font;
    private String color;

    public CharacterStyle(String font, String color) {
        this.font = font;
        this.color = color;
    }

    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }
}

class Character {
    private char symbol;
    private CharacterStyle style;

    public Character(char symbol, CharacterStyle style) {
        this.symbol = symbol;
        this.style = style;
    }

    public void draw() {
        System.out.println("Symbol: " + symbol + ", Font: " + style.getFont() + ", Color: " + style.getColor());
    }
}

class CharacterFactory {
    private Map<CharacterStyle, Character> characters = new HashMap<>();

    public Character getCharacter(char symbol, CharacterStyle style) {
        Character character = characters.get(style);

        if (character == null) {
            character = new Character(symbol, style);
            characters.put(style, character);
        }

        return character;
    }
}

public class Flyweight {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        CharacterStyle style1 = new CharacterStyle("Arial", "Red");
        CharacterStyle style2 = new CharacterStyle("Times New Roman", "Blue");

        Character character1 = factory.getCharacter('A', style1);
        character1.draw();

        Character character2 = factory.getCharacter('B', style2);
        character2.draw();

        Character character3 = factory.getCharacter('C', style1);
        character3.draw();
    }
}
