package data.structure.tree;

public class FindAncestors<E> {
    boolean nodeFound = false;
    public void find(Node<E> root, Node<E> node) {
        if (root == null || nodeFound) {
            return;
        }
        if (root.getData().equals(node.getData())) {
            nodeFound = true;
            return;
        }
        if(!nodeFound) {
            find(root.getLeft(), node);
        }
        if(!nodeFound) {
            find(root.getRight(), node);
        }
        if(nodeFound) {
            System.out.println(root.getData());
        }

        return;
    }


    public static void main(String[] args) {

        Node<Integer> root = new Node<Integer>(null, new Integer(1), null);

        Node<Integer> left1 = new Node<Integer>(null, new Integer(2), null);
        Node<Integer> right1 = new Node<Integer>(null, new Integer(3), null);

        Node<Integer> left2 = new Node<Integer>(null, new Integer(4), null);
        Node<Integer> right2 = new Node<Integer>(null, new Integer(5), null);

        Node<Integer> left3 = new Node<Integer>(null, new Integer(6), null);
        Node<Integer> right3 = new Node<Integer>(null, new Integer(7), null);

        Node<Integer> right4 = new Node<Integer>(null, new Integer(8), null);

        root.setLeft(left1);
        root.setRight(right1);

        left1.setLeft(left2);
        left1.setRight(right2);

        right1.setLeft(left3);
        right1.setRight(right3);

        right3.setRight(right4);

        FindAncestors<Integer> findAncestors = new FindAncestors<>();
        findAncestors.find(root, new Node(null, 8, null));
        //ancestors.forEach(System.out::print);

    }
}


