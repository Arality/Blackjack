public class One implements IValue{
    private final short value;

    public One() {
        value = 1;
    }

    public String toString() {
        return String.valueOf(value);
    }

    public short valueOf() {
        return value;
    }