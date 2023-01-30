package machine;

import machine.coffee.CoffeeType;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public final class Ui {
    private final Scanner scanner = new Scanner(System.in);
    private final PrintWriter printer = new PrintWriter(System.out,true);

    public Action parseAction() {

        printString("Write action (buy, fill, take, remaining, exit): ");
        var action = Action.createFromString(scanner.next());
        printer.println();
        return action;
    }

    public CoffeeType parseCoffee() {
        printString("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        return CoffeeType.createFromIndex(scanner.next());
    }
    public Consumables parseConsumables(){
        int water,milk,beans,cups =0;
        printString("Write how many ml of water you want to add: ");
        water = scanner.nextInt();
        printString("Write how many ml of milk you want to add: ");
        milk = scanner.nextInt();
        printString("Write how many grams of coffee beans you want to add: ");
        beans = scanner.nextInt();
        printString("Write how many disposable cups you want to add: ");
        cups = scanner.nextInt();
        return new Consumables(water, milk, beans, cups);
    }

    public void printString(String string){
        printer.println(string);
    }
    public void printMachineState(MachineState state){
        printer.println("The coffee machine has:");
        printer.println(state.water() + "  ml of water");
        printer.println(state.milk() + "  ml of milk");
        printer.println(state.beans() + " g of coffee beans");
        printer.println(state.cups() + " disposable cups");
        printer.println("$" + state.money() + " of money");
        printer.println();
    }


}
