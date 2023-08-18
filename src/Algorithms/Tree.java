package Algorithms;

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
}
