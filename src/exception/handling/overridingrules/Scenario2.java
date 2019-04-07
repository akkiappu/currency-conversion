package exception.handling.overridingrules;

import java.io.FileNotFoundException;
import java.io.IOException;

/***
 * If parent class throwing checked exception then child class:
 * 1. can throw only same or sub type of super class exception
 * 2. cannot throw any exception, its not mandatory.(But if throwing it should be sub or same type)
 *
 * Note : There is no rule for any unchecked exception
 * Writing code "throws FileNotFoundException,Exception" on line no 33 will give compile time exception
 */
class Parent1{
    void m1() throws Exception,IOException {

    }

}
class Child1 extends Parent1{
    @Override
    void m1(){

    }
}

class Parent2{
    void m2() throws IOException {

    }
}
class Child2 extends Parent2{
    @Override
    void m2()throws FileNotFoundException{/*throws FileNotFoundException,Exception*/

    }
}
public class Scenario2 {
   
}
