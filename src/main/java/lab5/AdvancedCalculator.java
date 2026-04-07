package lab5;

public class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int initialValue) {
        super(initialValue);
    }

    public AdvancedCalculator divide(int x) {
        if (x != 0) {
            this.state /= x;
        } else {
            System.out.println("Eroare: Împărțire la zero!");
        }
        return this;
    }

    public AdvancedCalculator power(int n) {
        this.state = (int) Math.pow(this.state, n);
        return this;
    }

    public AdvancedCalculator root(int n) {
        if (n > 0) {
            this.state = (int) Math.pow(this.state, 1.0 / n);
        }
        return this;
    }
}