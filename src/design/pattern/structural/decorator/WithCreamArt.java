package design.pattern.structural.decorator;

public class WithCreamArt extends CoffeeDecorator {
    public WithCreamArt(Coffee regularCoffee) {
        super(regularCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 7;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", with cream art";
    }
}
