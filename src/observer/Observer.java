package observer;

// Observer interface defines the behavior for objects that observe the observable
interface Observer {
    // Called when the observable notifies the observer about an update
    void update();

    // Allows the observer to subscribe to a specific observable
    void subscribe(Observable observable);
}
