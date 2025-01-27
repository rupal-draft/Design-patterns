package solid_principles.interface_segment;

public class InterfaceSegmentSolution {

    public static void main(String[] args) {
        System.out.println("Interface Segmentation Solution");
    }
}

// Solution
// Chef only needs to implement cookFood
// Break RestaurantEmployee into ChefInterface and WaiterInterface
// ChefInterface only needs to implement cookFood
// WaiterInterface needs to implement serveFood and takeOrders
interface ChefInterface {
    void cookFood();
}

interface WaiterInterface {
    void serveFood();
    void takeOrders();
}

class ChefSolution implements ChefInterface {

    @Override
    public void cookFood() {
        System.out.println("Cooking food");
    }
}

class WaiterSolution implements WaiterInterface {

    @Override
    public void serveFood() {
        System.out.println("Serving food");
    }

    @Override
    public void takeOrders() {
        System.out.println("Taking orders");
    }
}