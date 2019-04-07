package data.structure.tree;

import java.util.Stack;

public class Spiral {
    Stack<Node> evenLevel = new Stack<>();
    Stack<Node> oddLevel = new Stack<>();

    public void traverse(Node root) {
        if (root == null) {
            return;
        }
        evenLevel.push(root);
        while (!evenLevel.isEmpty() || !oddLevel.isEmpty()) {
            processEvenLevel();
            processOddLevel();
        }
    }

    private void processOddLevel() {
        while (!oddLevel.isEmpty()) {
            Node node = oddLevel.pop();
            System.out.println(node.getData());
            if (node.getRight() != null) {
                evenLevel.push(node.getRight());
            }
            if (node.getLeft() != null) {
                evenLevel.push(node.getLeft());
            }
        }
    }

    private void processEvenLevel() {
        while (!evenLevel.isEmpty()) {
            Node node = evenLevel.pop();
            System.out.println(node.getData());
            if (node.getLeft() != null) {
                oddLevel.push(node.getLeft());
            }
            if (node.getRight() != null) {
                oddLevel.push(node.getRight());
            }


        }
    }

    public static void main(String[] args) {
        //level0
        Node<Integer> root = new Node<Integer>(null, new Integer(1), null);

        //level1
        Node<Integer> level1_first = new Node<Integer>(null, new Integer(2), null);
        Node<Integer> level1_second = new Node<Integer>(null, new Integer(3), null);
        root.setLeft(level1_first);
        root.setRight(level1_second);

        //level2
        Node<Integer> level2_first = new Node<Integer>(null, new Integer(4), null);
        Node<Integer> level2_second = new Node<Integer>(null, new Integer(5), null);
        Node<Integer> level2_third = new Node<Integer>(null, new Integer(6), null);
        Node<Integer> level2_fourth = new Node<Integer>(null, new Integer(7), null);
        level1_first.setLeft(level2_first);
        level1_first.setRight(level2_second);
        level1_second.setLeft(level2_third);
        level1_second.setRight(level2_fourth);

        //level3
        Node<Integer> level3_first = new Node<Integer>(null, new Integer(8), null);
        Node<Integer> level3_second = new Node<Integer>(null, new Integer(9), null);
        Node<Integer> level3_third = new Node<Integer>(null, new Integer(10), null);
        Node<Integer> level3_fourth = new Node<Integer>(null, new Integer(11), null);
        level2_first.setLeft(level3_first);
        level2_first.setRight(level3_second);
        level2_second.setLeft(level3_third);
        level2_fourth.setRight(level3_fourth);

        Spiral spiral = new Spiral();
        spiral.traverse(root);
    }
}
