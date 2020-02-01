import Util.FetchData;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.util.ArrayList;
import java.lang.*;
import java.util.List;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;

    }
}

public class Main {
    static Node root;

    Main() //constructor
    {
        root = null;
    }

    public void addNode(int value) { // public method is called by the object and this public method calls the private method in which the root is also passed.
        root = add(root, value);
    }

    private Node add(Node node, int value) {
        if (node == null) {
            node = new Node(value);
        } else if (value == node.data) {
            node.data = value;
        } else if (value < node.data) {
            node.left = add(node.left, value);
        } else {
            node.right = add(node.right, value);
        }
        return node;
    }

    public static void main(String[] args) throws Exception {
        FetchData fetchData = new FetchData();
        List<ValueRange> allRows = fetchData.getData();
        Main obj = new Main();
        for (int i = 0; i < allRows.size(); i++) {
            obj.add(Main.root, (Integer) allRows.get(i).getValues().get(0).get(0));
        }
        printReverseInorder(Main.root);
    }

    private static void printReverseInorder(Node node) {
        if (node == null)
            return;

        /* first recur on left child */
        printReverseInorder(node.right);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        printReverseInorder(node.left);
    }
}
