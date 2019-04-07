package companies.online.tests.automation.anywhere;

import java.util.*;

//program 1
class ATest{
    String name;
    void display(ATest t){
        t.name = "alan";
        t= null;

    }

    public static void main(String[] args) {
        ATest t  = new ATest();
        t.name = "arthur";
        t.display(t);
        System.out.println(t.name);
    }
}


//program 2
class Test extends Thread implements  Runnable{
    public static void main(String[] args) {
        try{
            Thread tj  =  new Thread(new Test());
            tj.start();
        }catch (Exception e){

        }
    }
}

//program 3
class Parent {
    static{
        System.out.println("static parent");
    }

    public Parent() {
        System.out.println("parent constructor");
    }

}

class Child extends  Parent{
    static{
        System.out.println("static child");
    }

    public Child() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        Parent p;
    }
}

//program 4
class qq39{
    public static void main(String[] args) {
        Student s = new Student(10);
        Student s2 = new Student(35);
        change(s);
        System.out.println(s.sid);
    }
    static void change(Student student){
        student.sid = student.sid + 10;
    }
}

class Student{
    static int sid;

    public Student(int sid) {
        this.sid = sid;
    }
}

//program 5

interface A{
    void test();
}

class B implements A{
    @Override
    public void test() {
        System.out.println("Test B");
    }
}

class C implements A{
    @Override
    public void test() {
        System.out.println("Test C");
    }

    public void check(){
        System.out.println("check C");
    }
}

class D extends B{
    public static void main(String[] args) {
        A a = new D();
        B b = new D();
        A c = new C();
        a.test();
        b.test();
        c.test();
        ((C)c).check();

    }
}
//program 6
class TestTreeSet implements Comparable<TestTreeSet>{
    public String getName() {
        return name;
    }

    String name;

    public TestTreeSet(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(TestTreeSet o) {
        return 0;
    }

    public static void main(String[] args) {
        TestTreeSet obj = new TestTreeSet("one");
        TestTreeSet obj2 = new TestTreeSet("two");
        Set<TestTreeSet> treeSets = new TreeSet<>();
        treeSets.add(obj);
        treeSets.add(obj2);

        System.out.println(treeSets.size());
        treeSets.iterator().forEachRemaining(tobj-> System.out.println(obj.getName()));

    }
}
//program 7
public class Output {
    public static void main(String[] args) {
        List list = new ArrayList();
        Output one =  new Output();
        Output two =  new Output();
        list.add(one);
        list.add(two);
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
