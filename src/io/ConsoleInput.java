package io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int getNextInt() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException inputMismatchException){
            throw new RuntimeException("Please enter valid number");
        }
    }

    @Override
    public void nextLine() {
        scanner.nextLine();
    }
}
