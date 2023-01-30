package machine.coffee;

import machine.Money;

public class Espresso extends AbstractCoffee{
    public Espresso() {
        super(250,0,16,new Money(4),CoffeeType.ESPRESSO);
    }
}
