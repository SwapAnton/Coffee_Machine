package machine;

import machine.coffee.*;

public final class Machine {
    private int water;
    private int milk;
    private int  beans;
    private Money money;
    private int cups;

    public Machine(int water, int milk, int beans, Money money,int cups) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.money = money;
        this.cups = cups;
    }

    private void canPrepare(AbstractCoffee coffee){

        int waterCups = water - coffee.water;
        int milkCups = milk - coffee.milk;
        int beansCups = beans - coffee.beans;

        if (waterCups <0 || milkCups <0 || beansCups <0 || cups <= 0)
        {
            throw new DomainException("ERROR_CANT_PREPARE_COFFEE_ENOUGH_RESOURCES");
        }
    }
    private AbstractCoffee prepareCoffee(AbstractCoffee coffee){
        canPrepare(coffee);
        water -= coffee.water;
        milk -= coffee.milk;
        beans -= coffee.beans;
        money = money.add(coffee.money);
        cups--;
        return coffee;
    }


    public MachineState getMachineState(){
        return new MachineState(water,milk,beans,cups,money.getAmount());
    }

    public AbstractCoffee buy(CoffeeType type){
        return switch (type){
            case ESPRESSO -> prepareCoffee(new Espresso());
            case LATTE -> prepareCoffee(new Latte());
            case CAPPUCCINO -> prepareCoffee(new Cappuccino());
        };
    }
    public void serve(Consumables consumables){
        water += consumables.water();
        milk += consumables.milk();
        beans += consumables.beans();
        cups += consumables.cups();
    }
    public Money takeMoney(){
        var returnedMoney = money;
        money = new Money(0);
        return returnedMoney;
    }
}
