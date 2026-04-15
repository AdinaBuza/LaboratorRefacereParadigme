package lab6.calculator;

public class Lab5 {

    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("6.8.1 a) Intcalculator result: " + result);

        AdvancedCalculator calculator2 = new AdvancedCalculator(10);

        int result2 = calculator2.add(5).subtract(3).multiply(2).add(3).root(3).result();
        System.out.println("6.8.1 b) AdvancedCalculator result: " + result2);
    }
}