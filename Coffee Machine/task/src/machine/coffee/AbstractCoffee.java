package machine.coffee;

import machine.Money;

public abstract class AbstractCoffee {
    public final int water;
    public final int milk;
    public final int  beans;
    public final Money money;
    public final CoffeeType type;

    protected AbstractCoffee(int water, int milk, int beans, Money money, CoffeeType type) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.money = money;
        this.type = type;
    }
}
