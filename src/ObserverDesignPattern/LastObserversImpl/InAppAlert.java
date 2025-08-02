package src.ObserverDesignPattern.LastObserversImpl;

import src.ObserverDesignPattern.LastObservers.NotificationType;
import src.ObserverDesignPattern.NextObservable_TopLevelObserver.Person;

public class InAppAlert implements NotificationType {

   Person person;

    public InAppAlert(Person person) {
        this.person = person;
        person.add(this);
    }

    @Override
    public void update() {
        System.out.println("Car ALERT In App notification sent.");
    }
}
