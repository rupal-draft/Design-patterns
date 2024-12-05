package solid_principles.open_closed;

import solid_principles.open_closed.operation.MultiplyOperation;

public class Main {

    public static void main(String[] args){

        CalculatorMain calculator = new CalculatorMain();
        MultiplyOperation multiplyOperation = new MultiplyOperation();

        calculator.calculate(2,2, multiplyOperation);
    }
}
