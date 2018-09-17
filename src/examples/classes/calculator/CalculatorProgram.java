package examples.classes.calculator;

public class CalculatorProgram {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(0);
        System.out.println("Current value: " + calculator.value);

        calculator.add(2);
        calculator.cube();
        calculator.square();

        System.out.println(calculator.value);

    }
}
