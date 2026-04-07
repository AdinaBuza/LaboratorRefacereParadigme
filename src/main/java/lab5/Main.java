package lab5;

public class Main {
    public static void main(String[] args) {

        IntCalculator calculator = new IntCalculator(10);
        int result1 = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("Rezultat IntCalculator (10 + 5 - 3) * 2 = " + result1);

        AdvancedCalculator advCalc = new AdvancedCalculator(10);

        int result2 = advCalc.divide(2).power(3).root(2).result();
        System.out.println("Rezultat AdvancedCalculator = " + result2);
    }
}