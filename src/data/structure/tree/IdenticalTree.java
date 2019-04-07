package data.structure.tree;

public class IdenticalTree {

    public boolean isIdentical(Node r1, Node r2){

        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null || r2 == null || (r1.getData() != r2.getData())){
            return false;
        }
        return isIdentical(r1.getLeft(), r2.getLeft()) && isIdentical(r1.getRight(),r2.getRight());
    }

    public static void main(String[] args) {
        Node<Integer> tree1Root = new Node<>(null,1, null);
        Node<Integer> tree2Root = new Node<>(null,1, null);

        Node<Integer> tree1Level1Left = new Node<>(null,2, null);
        Node<Integer> tree1Level1Right = new Node<>(null,3, null);

        Node<Integer> tree2Level1Left = new Node<>(null,2, null);
        Node<Integer> tree2Level1Right = new Node<>(null,3, null);
        tree1Root.setLeft(tree1Level1Left);
        tree1Root.setRight(tree1Level1Right);

        tree2Root.setLeft(tree2Level1Left);
        tree2Root.setRight(tree2Level1Right);

        IdenticalTree identicalTree = new IdenticalTree();

        //true
        System.out.println(identicalTree.isIdentical(tree1Root,tree2Root));

        tree2Root.setLeft(tree2Level1Right);
        tree2Root.setRight(tree2Level1Left);
        //false
        System.out.println(identicalTree.isIdentical(tree1Root,tree2Root));
    }
}
