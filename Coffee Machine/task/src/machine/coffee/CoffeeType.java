package machine.coffee;

import machine.DomainException;

public enum CoffeeType {
    ESPRESSO("espresso"),LATTE("latte"),CAPPUCCINO("cappuccino");
    private final String name;

    CoffeeType(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static CoffeeType createFromIndex(String index){
        return switch (index){
            case "1" -> CoffeeType.ESPRESSO;
            case "2" -> CoffeeType.LATTE;
            case "3" -> CoffeeType.CAPPUCCINO;
            default -> throw new DomainException("INVALID_COFFEE_INDEX");
        };
    }
}
