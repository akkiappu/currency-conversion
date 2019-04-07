package data.structure.tree;

public class MirrorImage {
    public void create(Node root){
        traverse(root);
        System.out.println(root);
    }

    private void traverse(Node node){
        if(node == null){
            return;
        }
        Node temp = node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(temp);
        traverse(node.getLeft());
        traverse(node.getRight());
    }

    public static void main(String[] args) {

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

        MirrorImage mirrorImage =  new MirrorImage();
        mirrorImage.create(root);
    }
}
