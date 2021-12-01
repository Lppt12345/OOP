package T10.NL1;

public class Numeral extends Expression {

    private double value;

    public Numeral() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (Double.isInfinite(value)) {
            return value + "";
        }
        if (value == Math.floor(value)) {
            return (int) value + "";
        }
        return value + "";
    }

    @Override
    public double evaluate() {
        return value;
    }
}
