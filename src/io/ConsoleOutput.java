package io;

public class ConsoleOutput implements Output{
    @Override
    public void displayOptions() {
        System.out.println("Select Option");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("5.Exit");
    }

    @Override
    public void display(String result) {
        System.out.println(result);
    }
}
