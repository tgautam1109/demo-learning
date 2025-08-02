package src.ObserverDesignPattern.TopLevelObservable;

import src.ObserverDesignPattern.NextObservable_TopLevelObserver.Person;

public interface IntrusionAlertSystem_Subject {

    public void add(Person o);

    public void remove(Person o);

    public void sendNotification();

    public void checkEvent();

}
