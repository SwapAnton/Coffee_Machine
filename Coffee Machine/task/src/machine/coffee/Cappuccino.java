package machine.coffee;

import machine.Money;

public class Cappuccino extends AbstractCoffee{
    public Cappuccino() {
        super(200,100,12,new Money(6),CoffeeType.CAPPUCCINO);
    }
}
