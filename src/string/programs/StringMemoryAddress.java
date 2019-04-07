package string.programs;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class StringMemoryAddress {
    private static Unsafe unsafe;
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(System.identityHashCode(s1));//Print logical address in the form of hashcode
        System.out.println(s1.hashCode());//Print override hashcode of string class

        System.out.println(System.identityHashCode(s2));//Print logical address in the form of hashcode
        System.out.println(s2.hashCode());//Print override hashcode of string class

        System.out.println(System.identityHashCode(s3));//Print logical address in the form of hashcode
        System.out.println(s3.hashCode());//Print override hashcode of string class

        System.out.println(System.identityHashCode(s4));//Print logical address in the form of hashcode
        System.out.println(s4.hashCode());//Print override hashcode of string class


        try {
            System.out.println(addressOf(s1));//Print physical address
            System.out.println(addressOf(s2));//Print physical address
            System.out.println(addressOf(s3));//Print physical address
            System.out.println(addressOf(s4));//Print physical address
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static
    {
        try
        {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe)field.get(null);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static long addressOf(Object o)
            throws Exception
    {
        Object[] array = new Object[] {o};

        long baseOffset = unsafe.arrayBaseOffset(Object[].class);
        int addressSize = unsafe.addressSize();
        long objectAddress;
        switch (addressSize)
        {
            case 4:
                objectAddress = unsafe.getInt(array, baseOffset);
                break;
            case 8:
                objectAddress = unsafe.getLong(array, baseOffset);
                break;
            default:
                throw new Error("unsupported address size: " + addressSize);
        }

        return(objectAddress);
    }
}
