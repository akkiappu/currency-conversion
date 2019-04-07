package string.programs.hackerrank;

public class StringSmallestAndLargest {
    public static void main(String[] args) {
        //program3 Find smallest and largest
        String s = "welcometojava";
        int k = 3;
        String smallest = "";
        String largest = "";

        String str[] = new String[s.length()- (k-1)];
        for(int currentIndex = 0; k <= s.length(); k++,currentIndex++){
            str[currentIndex] = s.substring(currentIndex,k);
            if(currentIndex > 0){
                if(str[currentIndex].compareTo(smallest) < 0){
                    smallest = str[currentIndex];
                    continue;
                }
                if(str[currentIndex].compareTo(largest) > 0){
                    largest = str[currentIndex];
                    continue;
                }

            }else {
                smallest = str[currentIndex];
                largest = str[currentIndex];
            }

        }


        System.out.println(smallest);
        System.out.println(largest);
    }
}
