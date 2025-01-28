package observer;

import java.util.ArrayList;
import java.util.List;

// Demonstration of the Observer Design Pattern
public class ObserverDesign {

    public static void main(String[] args) {

        // Create an observable object (Channel)
        Observable observable = new Channel();

        // Create observers (Subscribers)
        Subscriber subscriber1 = new Subscriber("John Doe");
        Subscriber subscriber2 = new Subscriber("Jane Doe");
        Subscriber subscriber3 = new Subscriber("Emilia Doe");

        // Add subscribers to the observable (Channel)
        observable.add(subscriber1);
        observable.add(subscriber2);
        observable.add(subscriber3);

        // Subscribers subscribe to the observable (Channel)
        subscriber1.subscribe(observable);
        subscriber2.subscribe(observable);
        subscriber3.subscribe(observable);

        // Upload a new video, which will notify all subscribers
        observable.upload("New video");
    }
}

// Concrete implementation of the Observable interface
// Represents a YouTube Channel or any entity being observed
class Channel implements Observable {

    private String title; // Stores the title of the latest update (e.g., video)
    private List<Subscriber> subscribers = new ArrayList<>(); // List of all subscribers (observers)

    @Override
    public String getTitle() {
        return title; // Return the title of the latest video
    }

    @Override
    public void add(Subscriber subscriber) {
        subscribers.add(subscriber); // Add a new subscriber to the list
    }

    @Override
    public void remove(Subscriber subscriber) {
        subscribers.remove(subscriber); // Remove a subscriber from the list
    }

    @Override
    public void notifySubscribers() {
        // Notify each subscriber by calling their update method
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    @Override
    public void upload(String title) {
        // Set the title of the latest update and notify all subscribers
        this.title = title;
        notifySubscribers();
    }
}

// Concrete implementation of the Observer interface
// Represents a subscriber who observes a channel or other observable object
class Subscriber implements Observer {

    private String name; // Name of the subscriber
    private Observable observable; // The observable that the subscriber is subscribed to

    // Constructor to create a new subscriber with a given name
    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        // Print a message indicating that the subscriber has been notified
        System.out.println("Updated for: " + this.name + " - " + this.observable.getTitle());
    }

    @Override
    public void subscribe(Observable observable) {
        // Subscribe to a specific observable
        this.observable = observable;
    }
}
