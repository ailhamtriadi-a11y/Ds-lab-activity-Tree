package ds.lab.activity;

import java.util.ArrayList;
import java.util.List;

public class PrintLeafNodes {
    public static void printLeafNodes(Node node) {
        if (node == null) return;

        if (node.children.isEmpty()) {
            System.out.println("Leaf: " + node.value);
        } else {
            for (Node child : node.children) {
                printLeafNodes(child);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node("Root");
        root.children.add(new Node("Leaf 1"));
        root.children.add(new Node("Leaf 2"));

        printLeafNodes(root);
    }

    static class Node {
        String value;
        List<Node> children = new ArrayList<>();

        Node(String value) {
            this.value = value;
        }
    }
}