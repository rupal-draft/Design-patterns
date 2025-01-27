package solid_principles.dependency_inversion;

// This code violates the Dependency Inversion Principle
public class Problem {

    public static void main(String[] args) {
        // High-level module (App) depends directly on low-level modules
        WiredKeyboard keyboard = new WiredKeyboard();
        Monitor monitor = new Monitor();
        Computer computer = new Computer(keyboard, monitor);

        // Starting the computer
        computer.start();
    }
}

// Low-level module: WiredKeyboard
class WiredKeyboard {
    public void type() {
        System.out.println("Typing on a wired keyboard...");
    }
}

// Low-level module: Monitor
class Monitor {
    public void display() {
        System.out.println("Displaying on the monitor...");
    }
}

// High-level module: Computer
// Directly depends on specific low-level modules (WiredKeyboard and Monitor)
class Computer {
    private WiredKeyboard keyboard;
    private Monitor monitor;

    // Constructor to initialize specific keyboard and monitor
    public Computer(WiredKeyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    // Start the computer, which depends on the specific keyboard and monitor
    public void start() {
        System.out.println("Starting the computer...");
        keyboard.type();
        monitor.display();
    }
}