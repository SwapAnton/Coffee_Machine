package machine.coffee;

import machine.Money;

public class Latte extends AbstractCoffee{
    public Latte() {
        super(350,75,20,new Money(7),CoffeeType.LATTE);
    }
}
