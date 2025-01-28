package observer;

// Observable interface defines the behavior for objects that will be observed
interface Observable {
    // Get the title of the latest update
    String getTitle();

    // Add a new observer to the observable's list
    void add(Subscriber subscriber);

    // Remove an observer from the observable's list
    void remove(Subscriber subscriber);

    // Notify all observers about an update
    void notifySubscribers();

    // Trigger an update (e.g., uploading a new video)
    void upload(String title);
}
