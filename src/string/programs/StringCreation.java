package string.programs;

public class StringCreation {
    public static void main(String[] args) {
        //creation in heap memory using new keyword
        String stringInHeap = new String("I am in heap memory now");

        //creation in literal pool(inside heap).Its a memory shared by same content object.
        String stringInPool = "I am in string constant pool";

    }
}
