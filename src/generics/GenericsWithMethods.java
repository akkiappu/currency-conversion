package generics;

import java.util.Arrays;
import java.util.List;

public class GenericsWithMethods {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(new Integer[]{4,5,44,34,55})).intValue());
        System.out.println(sum(Arrays.asList(new Float[]{4f,5f,44f,343f,5f})).floatValue());
        System.out.println(sum(Arrays.asList(new Double[]{4d,5d,4d,343d,55d})).doubleValue());
        System.out.println(sum(Arrays.asList(new Long[]{41l,5l,4l,343l,55l})).longValue());
    }

    private static <T extends Number> Number sum(List<T> list) {
        Number number = 0;
        for (int i = 0; i < list.size(); i++) {
            number = number.doubleValue() + list.get(i).doubleValue();
        }
        return number;
    }
    private static <K,V> V doSomething(K k,V v){
        return v;
    }
}
