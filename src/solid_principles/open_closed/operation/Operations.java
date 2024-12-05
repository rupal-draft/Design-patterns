package solid_principles.open_closed.operation;

// This is good we keep adding new operation implementation
// and our calculator get extensions without modifying it main task
// that is performing calculation

public interface Operations {
    public int perform(int number1,int number2);
}
