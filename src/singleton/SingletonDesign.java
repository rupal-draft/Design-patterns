package singleton;

// Singleton Design Pattern
public class SingletonDesign {

    public static void main(String[] args) {

        // Get the single instance of Database
        Database database1 = Database.getInstance();
        database1.connect();

        // Get the same instance of Database
        Database database2 = Database.getInstance();
        database2.connect();

        // Verify both references point to the same object
        System.out.println("Are both instances the same? " + (database1 == database2));
    }
}

// Singleton Class: Database
class Database {

    // Static variable to hold the single instance of the class
    private static Database instance;

    // Private constructor to prevent instantiation from other classes
    private Database() {
        System.out.println("Database instance created!");
    }

    // Public method to provide access to the single instance
    public static Database getInstance() {
        if (instance == null) { // Check if the instance is not created yet
            instance = new Database(); // Create the instance
        }
        return instance; // Return the single instance
    }

    // Example method to simulate a database connection
    public void connect() {
        System.out.println("Connected to the database.");
    }
}
