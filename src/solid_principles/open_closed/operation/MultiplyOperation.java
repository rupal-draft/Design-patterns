package solid_principles.open_closed.operation;

public class MultiplyOperation implements Operations {
    @Override
    public int perform(int number1, int number2) {
        return number1*number2;
    }
}
