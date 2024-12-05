package solid_principles.dependancy_inversion.good;

/**
 * So we will have this class but it will be taken care
 * via interface implementation.
 *
 */

public class AddOperation implements CalculateOperations{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
