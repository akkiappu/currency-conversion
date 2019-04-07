package gs.coderpad;

public class SnowLevel {

    public static void main(String[] args) {
        int result = computeSnowPack(new Integer[]{0,1,3,0,1,2,0,4,2,0,3,0});
        System.out.println(result);
        result = computeSnowPack(new Integer[]{1,2,0,2,6,3,1,7,5,7,2,4,3,1});
        System.out.println(result);
    }

    public static int computeSnowPack(Integer[] arr){

        int nextBiggerBuilding = 0;
        int gapBetweenBuilding = 0;
        int fillCount = 0;
        //Iterate forward from start to tall building end
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= arr[nextBiggerBuilding]){
                if(gapBetweenBuilding > 0){
                    for(int j = nextBiggerBuilding + 1; j < i; j++){
                        fillCount = fillCount + arr[nextBiggerBuilding] - arr[j];
                    }
                    gapBetweenBuilding = 0;
                }
                nextBiggerBuilding = i;
            }else{
                gapBetweenBuilding++;
            }
        }

        if(nextBiggerBuilding != arr.length){
            int tallBuildingEnd = nextBiggerBuilding;
            gapBetweenBuilding = 0;
            nextBiggerBuilding = 0;
            //Iterate backward from end to tall building
            for(int i = arr.length - 1; i >= tallBuildingEnd; i--){
                if(arr[i] >= arr[nextBiggerBuilding]){
                    if(gapBetweenBuilding > 0){
                        for(int j = nextBiggerBuilding - 1; j > i; j--){
                            fillCount = fillCount + arr[nextBiggerBuilding] - arr[j];
                        }
                        gapBetweenBuilding = 0;
                    }
                    nextBiggerBuilding = i;
                }else{
                    gapBetweenBuilding++;
                }
            }
        }

        return fillCount;
    }

}
