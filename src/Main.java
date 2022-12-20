import io.ConsoleInput;
import io.ConsoleOutput;

public class Main {
    public static void main(String[] args) {
        final Calculator calculator = new Calculator(new ConsoleInput(), new ConsoleOutput());
        calculator.start();
    }
}