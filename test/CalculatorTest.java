import io.Input;
import io.Output;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CalculatorTest {

    private Input input = Mockito.mock(Input.class);
    private Output output = Mockito.mock(Output.class);
    private Calculator calculator = new Calculator(input, output);


    @Test
    void shouldAddNumbersWhenUserSelectsFirstOption() {
        int a = 20;
        int b = 10;
        when(input.getNextInt()).thenReturn(1).thenReturn(a).thenReturn(b).thenReturn(5);

        calculator.start();

        verify(output).display("" + (a + b));
    }

    @Test
    void shouldSubtractNumbersWhenUserSelectSecondOption() {
        int a = 20;
        int b = 10;
        when(input.getNextInt()).thenReturn(2).thenReturn(a).thenReturn(b).thenReturn(5);

        calculator.start();

        verify(output).display("" + (a - b));
    }

    @Test
    void shouldExitApplicationWhenUserSelectFifthOption() {
        when(input.getNextInt()).thenReturn(5);

        calculator.start();

        verify(output).display("Exiting the application");
    }
}
