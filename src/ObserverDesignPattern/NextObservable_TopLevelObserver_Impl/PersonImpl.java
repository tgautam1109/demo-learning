package src.ObserverDesignPattern.NextObservable_TopLevelObserver_Impl;

import src.ObserverDesignPattern.LastObservers.NotificationType;
import src.ObserverDesignPattern.TopLevelObservable.IntrusionAlertSystem_Subject;
import src.ObserverDesignPattern.NextObservable_TopLevelObserver.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements Person {

    List<NotificationType> alertTypes;
    IntrusionAlertSystem_Subject subject;
    String name;

    public PersonImpl( String person, IntrusionAlertSystem_Subject subject){
        this.name = person;
        this.subject = subject;
        subject.add(this);
        this.alertTypes = new ArrayList<>();
    }

    @Override
    public void update() {
        System.out.println(name + " Your car BH25AA0006 is being intruded!!ALERT");
        sendNotification();
    }

    @Override
    public void add(NotificationType o) {
        alertTypes.add(o);
    }

    @Override
    public void remove(NotificationType o) {
        alertTypes.remove(o);
    }

    @Override
    public void sendNotification() {
        for (NotificationType type : alertTypes)
            type.update();
    }
}
