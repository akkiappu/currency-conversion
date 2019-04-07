package data.structure.tree;

public class DiameterTree {
    private int diameter = 0;

    public int getDiameterOfTree(Node root){
        calculate(root);
        return diameter + 1;
    }

    private int calculate(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = calculate(root.getLeft());
        int rightHeight = calculate(root.getRight());

        if(leftHeight+rightHeight > diameter){
            diameter = leftHeight+rightHeight;
        }

        return Math.max(leftHeight,rightHeight)+1;
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

        //level4
        Node<Integer> level4_first = new Node<Integer>(null, new Integer(12), null);
        Node<Integer> level4_second = new Node<Integer>(null, new Integer(13), null);
        level3_first.setLeft(level4_first);
        level3_third.setRight(level4_second);

        //level5
        Node<Integer> level5_first = new Node<Integer>(null, new Integer(14), null);
        Node<Integer> level5_second = new Node<Integer>(null, new Integer(15), null);

        level4_first.setLeft(level5_first);
        level4_second.setLeft(level5_second);

        DiameterTree diameterTree = new DiameterTree();
        System.out.println("Diameter : "+diameterTree.getDiameterOfTree(root));
    }

}
