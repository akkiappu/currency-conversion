package design.pattern.structural.decorator1;

public class ChocolateCoffee implements Coffee {
    private Coffee simpleCoffee;

    public ChocolateCoffee(Coffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    @Override
    public String prepare() {
        return simpleCoffee.prepare() + " Coffee with chocolate";
    }
}
