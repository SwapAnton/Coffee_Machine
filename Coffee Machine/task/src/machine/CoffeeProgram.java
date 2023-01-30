package machine;

public final class CoffeeProgram {
    private final Machine machine;
    private final Ui ui;

    public CoffeeProgram(Machine machine, Ui ui) {
        this.machine = machine;
        this.ui = ui;
    }

    public void start(){
                while (true){
            try {
                actionControl();
            }catch (DomainException e){
                ui.printString(e.getMessage());
            }
        }


    }
    private void actionControl(){
        switch (ui.parseAction()){
            case BUY -> {
                machine.buy(ui.parseCoffee());
                ui.printString("I have enough resources, making you a coffee!");
            }
            case TAKE -> ui.printString("I gave you $" + machine.takeMoney().getAmount());
            case FILL -> machine.serve(ui.parseConsumables());
            case REMAINING ->  ui.printMachineState(machine.getMachineState());
            case EXIT -> System.exit(0);
        };
    }


}
