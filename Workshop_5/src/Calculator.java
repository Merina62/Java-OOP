public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultIntTwo = calculator.add(9, 4);
        System.out.println("Result of adding two integers: " + resultIntTwo);

        int resultIntThree = calculator.add(11, 25, 20);
        System.out.println("Result of adding three integers: " + resultIntThree);

        double resultDoubleTwo = calculator.add(4.5, 2.7);
        System.out.println("Result of adding two doubles: " + resultDoubleTwo);

        double resultDoubleThree = calculator.add(1.5, 3.5, 3.5);
        System.out.println("Result of adding three doubles: " + resultDoubleThree);
    }
}