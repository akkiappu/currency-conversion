package exception.handling.overridingrules;
/*****
 * If parent not throwing any exception, then child cannot throw any exception.
 * Note : There is no rule for any unchecked exception
 * Below code snippet will give compile time error on line no 18
 */

class Parent{
    void m1(){

    }
}
class Child extends Parent{
    @Override
    void m1() /*throws Exception*/ {

    }
}
public class Scenario1 {
}
