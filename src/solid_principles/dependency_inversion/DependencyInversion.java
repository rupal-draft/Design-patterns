package solid_principles.dependency_inversion;

// This code follows the Dependency Inversion Principle
public class DependencyInversion {

    public static void main(String[] args) {
        // Using abstraction (interfaces) for dependencies
        Keyboard keyboard = new WiredKeyboardClass();
        Display display = new MonitorClass();

        // High-level module depends on abstractions, not concrete implementations
        ComputerClass computer = new ComputerClass(keyboard, display);

        // Starting the computer
        computer.start();
    }
}

// Abstraction for Keyboard
interface Keyboard {
    void type();
}

// Abstraction for Display
interface Display {
    void show();
}

// Low-level module: WiredKeyboard (implements Keyboard)
class WiredKeyboardClass implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing on a wired keyboard...");
    }
}

// Low-level module: WirelessKeyboard (implements Keyboard)
class WirelessKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing on a wireless keyboard...");
    }
}

// Low-level module: Monitor (implements Display)
class MonitorClass implements Display {
    @Override
    public void show() {
        System.out.println("Displaying on the monitor...");
    }
}

// Low-level module: Projector (implements Display)
class Projector implements Display {
    @Override
    public void show() {
        System.out.println("Displaying on the projector...");
    }
}

// High-level module: Computer
// Depends on abstractions (Keyboard and Display)
class ComputerClass {
    private Keyboard keyboard; // Abstraction for keyboard
    private Display display;   // Abstraction for display

    // Constructor to inject dependencies
    public ComputerClass(Keyboard keyboard, Display display) {
        this.keyboard = keyboard;
        this.display = display;
    }

    // Start the computer, using the injected dependencies
    public void start() {
        System.out.println("Starting the computer...");
        keyboard.type();
        display.show();
    }
}
