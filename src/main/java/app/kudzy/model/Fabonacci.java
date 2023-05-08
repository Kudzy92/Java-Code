package app.kudzy.model;

public class Fabonacci <T extends Number> {
    private T maxNumber;
    private T startNumber;

    public Fabonacci() {
    }

    public Fabonacci(T maxNumber, T startNumber) {
        this.maxNumber = maxNumber;
        this.startNumber = startNumber;
    }

    public T getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(T maxNumber) {
        this.maxNumber = maxNumber;
    }

    public T getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(T startNumber) {
        this.startNumber = startNumber;
    }
}
