import io.Input;
import io.Output;

public class Calculator {

    private final Input input;
    private final Output output;

    public Calculator(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void add() {
        output.display("Enter Two Integers");
        int a = input.getNextInt();
        int b = input.getNextInt();
        output.display("" + (a + b));
    }

    public void subtraction() {
        output.display("Enter two integers");
        int a = input.getNextInt();
        int b = input.getNextInt();
        output.display("" + (a - b));
    }

    public void multiply() {
        output.display("Enter two integers");
        int a = input.getNextInt();
        int b = input.getNextInt();
        output.display("" + a * b);
    }

    public void start() {
        while (true) {
            try {
                output.displayOptions();
                int option = input.getNextInt();
                switch (option) {
                    case 1:
                        add();
                        break;
                    case 2:
                        subtraction();
                        break;
                    case 3:
                        multiply();
                        break;
                    case 5:
                        output.display("Exiting the application");
                        return;

                }
            } catch (Exception exception) {
                output.display(exception.getMessage());
                input.nextLine();
            }
        }
    }

}
