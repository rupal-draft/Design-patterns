package solid_principles.dependancy_inversion.bad;

/**
 * Let's take similar example which we have in Open Closed.
 * Here we are having calculator with add and sub functionality
 * and user is sending choice for it.
 * These operations are called as submodule in the system
 *
 */

public class AddOperation {
    public int add(int a, int b){
        return a+b;
    }
}
