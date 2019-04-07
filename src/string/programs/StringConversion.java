package string.programs;

public class StringConversion {
    public static void main(String[] args) {
        //integer to string
        int value = 1152019;
        System.out.println(String.valueOf(value));//created in heap
        System.out.println("hashcode : " + String.valueOf(value).hashCode());

        System.out.println(""+value);//created in pool
        System.out.println((""+value).hashCode());


        System.out.println(Integer.toString(value));//created in heap
        System.out.println(Integer.toString(value).hashCode());


    }
}
