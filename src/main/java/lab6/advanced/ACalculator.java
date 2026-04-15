package lab6.advanced;

public abstract class ACalculator<T> {
    Object state;

    public abstract ACalculator<T> init();

    @SuppressWarnings("unchecked")
    public T result() {
        return (T) state;
    }

    public void clear() {
        state = null;
    }
}