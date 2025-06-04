import calculator.Calculator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // testing Calculator
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Input a Command: ");
            String command = sc.nextLine();
            System.out.printf("Input a %s variable: ", command.toUpperCase());
            double var = sc.nextDouble();
            sc.nextLine();
            if (command.equalsIgnoreCase("exit")) break;
            performCommand(command, var, calculator);
        } while (true);

        System.out.println("Exiting...!");
        System.out.println("Closed!");
    }

    public static void showCommands() {
        System.out.println("""
                You can:
                -> add
                -> subtract
                -> watch history""");
    }
    public static void performCommand(String command, double var, Calculator cal) {

        switch (command.toLowerCase()) {
            case "add" -> cal.add(var);
            case "subtract" -> cal.subtract(var);
            case "history" -> cal.printHistory();
            case "show commands" -> showCommands();
            default -> {}
        }
    }
}