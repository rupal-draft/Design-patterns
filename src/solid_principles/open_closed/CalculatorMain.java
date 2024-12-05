package solid_principles.open_closed;

import solid_principles.open_closed.operation.Operations;

// No modifications in our calculator functionality
// We can keep adding extension by create new operations

public class CalculatorMain {

    public void calculate(int num1, int num2, Operations operations){
        System.out.println(operations.perform(num1,num2));
    }
}
