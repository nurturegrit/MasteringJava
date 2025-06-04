package calculator;

import java.util.ArrayList;

public class Calculator {
    public ArrayList<String> history;
    double variable;

    public Calculator() {
        this.variable = 0.0;
        this.history = new ArrayList<>();
        this.printOutput();
    }

    public void printHistory() {
        history.forEach(System.out::println);
    }

    public void printOutput() {
        System.out.printf("%.2f%n", this.variable);
    }

    public void add(double num) {
        if (num < 0) history.addLast("Subtracting %.2f".formatted(num));
        if (num > 0) history.addLast("Adding %.2f".formatted(num));
        this.variable += (double) num;
        this.printOutput();
    }

    public void add(int num) {
        if (num < 0) history.addLast("Subtracting %d".formatted(num));
        if (num > 0) history.addLast("Adding %d".formatted(num));
        this.variable += (double) num;
        this.printOutput();
    }

    public void subtract(int num) {
        add(-num);
    }
    public void subtract(double num) {
        add(-num);
    }
}
