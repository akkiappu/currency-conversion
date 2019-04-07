package design.pattern.structural.decorator;

public class WithSprinkles extends CoffeeDecorator {
    public WithSprinkles(Coffee regularCoffee) {
        super(regularCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", with Sprinkles";
    }
}
