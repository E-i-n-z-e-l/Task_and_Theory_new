package Algorithms;
/*
Этот код определяет класс Node, который представляет узел дерева.
Узел содержит значение (value) и ссылки на левый (left) и правый (right) дочерние узлы.
Конструктор класса Node принимает значение, ссылку на левый дочерний узел и ссылку на правый дочерний узел.
Метод toString() возвращает строковое представление узла, включая его значение
и значения его левого и правого дочерних узлов (если они есть).
 */
public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        String res = "значение нашего узла: " + value;
        if (left != null) {
            res += " значение левого: " + left.value;
        }
        if (right != null) {
            res += " значение правого: " + right.value;
        }
        return res;
    }
}
/*
public class Tree {
    Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node search(Node node, int data, Node parent) {
        if (node == null || data == node.value) {
            return node;
        }
        if (data > node.value) {
            return search(node.right, data, node);
        }
        if (data < node.value) {
            return search(node.left, data, node);
        }
        return null;
    }

    public void addNode(int value) {
        Node node = search(root, value, null);
        if (node == null) {
            System.out.println("Ой все, такое значение уже есть");
            return;
        }
        Node newNode = new Node(value, null, null);
        if (value > node.value) {
            node.right = newNode;
        } else {
            node.left = newNode;
        }
    }

//  public void printTree() {}

}
        */
/*
    public static void main(String[] args) {
        Node initialNode = new Node(15, null, null);
        Tree tree1 = new Tree(initialNode);

        System.out.println(initialNode);
        tree1.addNode(16);
        System.out.println(initialNode.right);
        System.out.println(initialNode);
        System.out.println(tree1.search(initialNode, 16, null));
    }
*/

