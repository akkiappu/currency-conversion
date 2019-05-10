package design.pattern.structural.decorator1;

public class SimpleCoffee implements Coffee {
    @Override
    public String prepare() {
        return "prepared simple coffee";
    }
}
