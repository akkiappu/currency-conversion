package data.structure.tree;

public class DistanceBetweenTwoNodes {
    private int from;
    private int to;
    private boolean fromFound;
    private boolean toFound;
    public int find(Node root, Node from, Node to){
        this.from = Integer.valueOf(from.getData().toString());
        this.to = Integer.valueOf(to.getData().toString());
        return -1;
    }

    private int traverse(Node root){

        int rootData = Integer.valueOf(root.getData().toString());
        if(!fromFound) {
            if (from == rootData) {
                fromFound = true;
                return 0;
            }

            if (from < rootData) {
                traverse(root.getLeft());
            }
            if (from > rootData) {
                traverse(root.getRight());
            }
        }

        if(!toFound){

        }


        return 0;
    }




}
