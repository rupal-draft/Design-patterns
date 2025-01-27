package solid_principles.interface_segment;

// Break interfaces into segments so that clients don't have to implement unnecessary methods

public class InterfaceSegmentProblem {

    public static void main(String[] args) {
        System.out.println("Demonstrating need of Interface Segregation");
    }
}

// Problem
// Chef doesn't need to implement takeOrders or serveFood
// Chef only needs to implement cookFood
interface RestaurantEmployee {
    void serveFood();
    void takeOrders();
    void cookFood();
}

class Chef implements RestaurantEmployee {

    @Override
    public void serveFood() {
        // Chef does not serve food still implements the method
    }

    @Override
    public void takeOrders() {
        // chef does not take orders still implements the method
    }
    @Override
    public void cookFood() {
        // Only necessary method in this class
        System.out.println("Cooking food");
    }
}

