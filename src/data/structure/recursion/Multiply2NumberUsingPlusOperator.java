package data.structure.recursion;

public class Multiply2NumberUsingPlusOperator {
    public int multiply(int x, int y){
        if(y == 1){
            return x;
        }
        return x + multiply(x,y - 1);
    }

}
