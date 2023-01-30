package machine;

public class CoffeeMachine {

    public static void main(String[] args) {

        Ui ui = new Ui();
        Machine machine = new Machine(400,540,120,new Money(550),9);
        CoffeeProgram coffeeProgram = new CoffeeProgram(machine, ui);
        coffeeProgram.start();


    }


}
