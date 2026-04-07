package lab5;

public class IntCalculator {
    protected int state;

    public IntCalculator(int initialValue) {
        this.state = initialValue;
    }

    public IntCalculator add(int x) {
        this.state += x;
        return this;
    }

    public IntCalculator subtract(int x) {
        this.state -= x;
        return this;
    }

    public IntCalculator multiply(int x) {
        this.state *= x;
        return this;
    }

    public IntCalculator clear() {
        this.state = 0;
        return this;
    }

    public int result() {
        return state;
    }
}