package src.ObserverDesignPattern.LastObserversImpl;

import src.ObserverDesignPattern.LastObservers.NotificationType;
import src.ObserverDesignPattern.NextObservable_TopLevelObserver.Person;

public class SMSAlert implements NotificationType {
    Person person;
    public SMSAlert(Person person) {
        this.person = person;
        person.add(this);
    }

    @Override
    public void update() {
        System.out.println("Car Alert SMS message sent.");
    }
}
