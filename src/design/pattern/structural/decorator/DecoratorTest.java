package design.pattern.structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Coffee coffeeWithSprinklesAndCreamArt = new WithCreamArt(new WithSprinkles(new RegularCoffee()));
        System.out.println(coffeeWithSprinklesAndCreamArt.getCost());
        System.out.println(coffeeWithSprinklesAndCreamArt.getIngredients());
    }
}
