package design.pattern.structural.decorator1;

public class CreamCoffee implements Coffee{
    private Coffee simpleCoffee;

    public CreamCoffee(Coffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    @Override
    public String prepare() {
        return simpleCoffee.prepare() + " Coffee with cream";
    }
}
