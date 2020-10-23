package calculator;


public class Main {

    public static void main(String[] args) {
	//
        SimpleCalculator calculator = new SimpleCalculator();

        // add
        System.out.println("\nCalculate add: " + calculator.add(20, 10));

        // subtract
        System.out.println("\nCalculate subtract: " + calculator.subtract(20, 10));

        // multiply
        System.out.println("\nCalculate multiply: " + calculator.multiply(20, 10));

        // divide
        System.out.println("\nCalculate divide: " + calculator.divide(20, 10));
    }
}
