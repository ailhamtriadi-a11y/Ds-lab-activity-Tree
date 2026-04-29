package ds.lab.activity;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public String value;
    public List<Node> children;

    public Node(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
}