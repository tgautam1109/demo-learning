package src.ObserverDesignPattern.NextObservable_TopLevelObserver;

import src.ObserverDesignPattern.LastObservers.NotificationType;

public interface Person {

    public void update();



    public void add(NotificationType type);

    public void remove(NotificationType type);

    public void sendNotification();

}
