package machine;

public final class Money {
    private final int amount;

    public Money(int amount) {
        if (amount<0){
            throw new DomainException("AMOUNT_CANT_BEEN_NEGATIVE");
        }
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
    public Money add(Money money){
        return new Money(amount+money.amount);
    }
}
