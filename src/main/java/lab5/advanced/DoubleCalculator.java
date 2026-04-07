package lab5.advanced;

public class DoubleCalculator extends ACalculator {

    public DoubleCalculator(Double valoareInitiala) {
        this.state = valoareInitiala;
    }

    @Override
    protected void init() {
        this.state = 0.0;
    }


    public DoubleCalculator add(Double v) {
        this.state = (Double) state + v;
        return this;
    }

    public DoubleCalculator subtract(Double v) {
        this.state = (Double) state - v;
        return this;
    }


    public DoubleCalculator multiply(Double v) {
        this.state = (Double) state * v;
        return this;
    }

}