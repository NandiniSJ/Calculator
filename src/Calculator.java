import io.Input;
import io.Output;

public class Calculator {

    private Input input;
    private Output output;

    public Calculator(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void add() {
        int a = input.getNextInt();
        int b = input.getNextInt();
        output.display("" + (a + b));
    }

    public void subtraction() {
        int a = input.getNextInt();
        int b = input.getNextInt();
        output.display("" + (a - b));
    }

    public void start() {
        while (true) {
            output.displayOptions();
            int option = input.getNextInt();
            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    subtraction();
                    break;
                case 5:
                    output.display("Exiting the application");
                    return;

            }
        }
    }

}
