package oops.programs;

class TestClass{
    public void m1(){
        System.out.println("In class method m1");
    }
}
interface TestInterface{
    default void m1(){
        System.out.println("In interface method m1");
    }
}
public class MethodCallingClassAndInterfaceHasSameSign extends TestClass implements TestInterface{
    public static void main(String[] args) {
        MethodCallingClassAndInterfaceHasSameSign obj = new MethodCallingClassAndInterfaceHasSameSign();
        obj.m1();
    }
}


