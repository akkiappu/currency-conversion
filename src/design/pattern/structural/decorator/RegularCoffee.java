package design.pattern.structural.decorator;

public class RegularCoffee implements Coffee {
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
