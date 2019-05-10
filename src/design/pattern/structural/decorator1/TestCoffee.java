package design.pattern.structural.decorator1;

public class TestCoffee {
    public static void main(String[] args) {
        Coffee coffee = new ChocolateCoffee(new CreamCoffee(new SimpleCoffee()));
        //System.out.println(coffee.prepare());
        //System.out.println("e".contains("aeiou"));
        //long count = coffee.prepare().chars().mapToObj(c -> (char)c).filter(c-> "aeiou".contains(c.toString())).count();
        //System.out.println(count);

    }
}
