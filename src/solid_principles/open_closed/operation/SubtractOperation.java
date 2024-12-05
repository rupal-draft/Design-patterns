package solid_principles.open_closed.operation;

public class SubtractOperation implements Operations {
    @Override
    public int perform(int number1, int number2) {
        return Math.abs(number1-number2);
    }
}
