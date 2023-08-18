package Algorithms;
/*
Этот код реализует структуру данных бинарное дерево поиска.
В классе Node описывается узел дерева, который содержит значение value и ссылки
на левый и правый дочерние узлы (left и right соответственно).
В классе Tree реализованы методы для поиска узла по значению (search) и
добавления нового узла в дерево (addNode).
В методе main создается объект класса Node с значением 15,
затем создается объект класса Tree с этим узлом в качестве корня.
Далее выводится информация о начальном узле, добавляется новый узел со значением 16,
выводится информация о правом дочернем узле начального узла и о самом начальном узле,
а также производится поиск узла со значением 16 в дереве с помощью метода search.
 */
public class Main {
    public static void main(String[] args) {
        Node initialNode = new Node(15, null, null);
        Tree tree1 = new Tree(initialNode);

        System.out.println(initialNode);
        tree1.addNode(16);
        System.out.println(initialNode.right);
        System.out.println(initialNode);
        System.out.println(tree1.search(initialNode, 16, null));
    }
}
