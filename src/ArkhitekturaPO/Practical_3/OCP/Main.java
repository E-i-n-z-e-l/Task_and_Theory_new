package ArkhitekturaPO.Practical_3.OCP;

/**
 В этом примере есть абстрактный класс Shape, от которого наследуются классы Circle и Rectangle.
 Класс ShapeDrawer используется для добавления и отрисовки различных фигур.
 Метод drawAllShapes циклически вызывает метод draw для каждой фигуры, не обращая внимания на их конкретный тип.

 Этот пример демонстрирует OCP, потому что код класса ShapeDrawer открыт для расширения новыми типами фигур
 (классами-наследниками класса Shape), но закрыт для изменений существующего кода.
 Если в будущем потребуется добавить новую фигуру, достаточно будет создать новый класс, наследующийся от Shape,
 и добавить его в ShapeDrawer, без изменения самого ShapeDrawer или других существующих классов.

 Тем самым, пример показывает, как принцип открытости/закрытости позволяет улучшать расширяемость и поддерживаемость
 программы, минимизируя необходимость внесения изменений в существующий код.
 */

public class Main {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.addShape(new Circle());
        drawer.addShape(new Rectangle());

        drawer.drawAllShapes();
    }
}
