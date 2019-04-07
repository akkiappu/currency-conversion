package generics;

import java.util.ArrayList;
import java.util.List;

class Fruit{}

class Apple extends Fruit{}
class GreenApple extends Apple{}
class ShimlaApple extends Apple{}

class Grapes extends Fruit{}
class SeedlessGrapes extends Grapes{}
class BlackGrapes extends Grapes{}


public class WildcardsExtendsType {
    public static void main(String[] args) {
        //Extends is a upper bound, or producer
        List<? extends Fruit> fruits1 = new ArrayList<Apple>();
        List<? extends Fruit> fruits2 = new ArrayList<BlackGrapes>();
        List<? extends Fruit> fruits3 = new ArrayList<Fruit>();
        /*****We cannot add any fruits type element to list, because there is no surety this list point to which type.
         * Above it can point to any sub type of fruit.
         * fruits1.add(new Grapes());**
         */

        /*****
         * Similarly we can read only fruits type element, because there is no surety this list point to which type.
         * for(Apple apple : fruits1){} not allow
         */
        for(Fruit fruit : fruits2){
            System.out.println(fruit);
        }

    }


}




