package data.structure.recursion;

public class SumOfNNaturalNumbers {

    /**
     * Sum of 10 number is equal to [10 + sum(9)]
     * Sum of 9 number is equal to [9 + sum(8)]
     * Sum of 8 number is equal to [8 + sum(7)]
     * and so on...
     */
    public int calculate(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return n + calculate(n - 1);
    }

}
