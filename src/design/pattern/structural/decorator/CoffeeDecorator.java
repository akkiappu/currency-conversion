package design.pattern.structural.decorator;

public class CoffeeDecorator implements Coffee {

    private Coffee regularCoffee;

    public CoffeeDecorator(Coffee regularCoffee) {
        this.regularCoffee = regularCoffee;
    }

    @Override
    public double getCost() {
        return regularCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return regularCoffee.getIngredients();
    }
}
