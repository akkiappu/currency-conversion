package data.structure.recursion;

public class GreatestCommonDivisor {
    public int findGCD(int[] numArr){
       return find(numArr,findMinNumber(numArr));
    }

    private int find(int[]numArr, int min){
        if(isReminderZero(numArr,min)){
            return min;
        }
        return find(numArr, min - 1);
    }
    private int findMinNumber(int[] numArr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] < min){
                min = numArr[i];
            }
        }
        return min;
    }

    private boolean isReminderZero(int numArr[], int no){
        for(int i : numArr){
            if(i % no != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        System.out.println(obj.findGCD(new int[]{12,6,9,18}));
    }
}
