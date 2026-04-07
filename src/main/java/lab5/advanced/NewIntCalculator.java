package lab5.advanced;

public class NewIntCalculator extends ACalculator {

    public NewIntCalculator(Integer valoareInitiala) {
        this.state = valoareInitiala;
    }

    @Override
    protected void init() {
        this.state = 0;
    }

    public NewIntCalculator add(Integer v) {
        this.state = (Integer) state + v;
        return this;
    }

    public NewIntCalculator subtract(Integer v) {
        this.state = (Integer) state - v;
        return this;
    }

    public NewIntCalculator multiply(Integer v) {
        this.state = (Integer) state * v;
        return this;
    }
}