package lab5.advanced;

public class Main {
    public static void main(String[] args) {

        NewIntCalculator intCalc = new NewIntCalculator(10);
        Integer resInt = (Integer) intCalc.add(5).subtract(3).multiply(2).result();
        System.out.println("Rezultat Int: (10 + 5 - 3) * 2 = " + resInt);


        DoubleCalculator doubleCalc = new DoubleCalculator(10.0);
        Double resDouble = (Double) doubleCalc.add(5.0).subtract(3.3).multiply(2.2).result();
        System.out.println("Rezultat Double: (10 + 5 - 3.3) * 2.2 = " + resDouble);


    }
}