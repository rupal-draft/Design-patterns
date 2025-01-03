package solid_principles.dependancy_inversion.good;

/**
 * As per DIP rule it states :
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * --- So low level is dependent via CalculatorOperation rather being depend on add or subtract operations.
 * Abstractions should not depend on details. Details should depend on abstractions
 * ---Abstraction is achieved as via interface we are entering in low level.
 */

public class Calculator {

    public int calculate(int a,int b,CalculateOperations calculateOperations){
        return calculateOperations.calculate(a,b);
    }
}
