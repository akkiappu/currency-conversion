package data.structure.recursion;

import java.util.Arrays;
import java.util.stream.IntStream;

//refer https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
public class CombinationOf2Numbers {
    int numbers[][];
    int [][] findCombinations(int arr[]){
        //find total combination nCr formula
        int totalCombination = (arr.length * (arr.length -1))/2;
        return numbers = new int[2][totalCombination];
    }

    private void find(int arr[]){
        if(arr.length == 0){
            return;
        }
        int temp = arr[0];
        find(Arrays.copyOfRange(arr,1,arr.length));
        IntStream.of(1,2,3);
    }
}

