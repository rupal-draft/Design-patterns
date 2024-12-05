package solid_principles.dependancy_inversion.good;

/**
 * One more sub module for substation
 */

public class SubOperation implements CalculateOperations{
    @Override
    public int calculate(int a, int b) {
        return Math.abs(a-b);
    }
}
