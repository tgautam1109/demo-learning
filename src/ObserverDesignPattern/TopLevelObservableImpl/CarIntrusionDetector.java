package src.ObserverDesignPattern.TopLevelObservableImpl;

import src.ObserverDesignPattern.TopLevelObservable.IntrusionAlertSystem_Subject;
import src.ObserverDesignPattern.NextObservable_TopLevelObserver.Person;

import java.util.ArrayList;
import java.util.List;

public class CarIntrusionDetector implements IntrusionAlertSystem_Subject {

    List<Person> observers;
    boolean signal;

    public CarIntrusionDetector(boolean signal) {
        this.observers = new ArrayList<>();
        this.signal = signal;
         }

    @Override
    public void add(Person observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Person observer) {
        observers.remove(observer);
    }

    @Override
    public void sendNotification() {
        for(Person ob : observers)
            ob.update();
    }

    @Override
    public void checkEvent(){
        if(signal)
        {
            System.out.println("****ALERT! CAR INTRUSION DETECTED! ALERT! ALERT! SOMEONE INTRUDING YOUR ALTO! ALERT!!*****");
            sendNotification();
        }
        else{
            System.out.println("Worried about your car? Relax as CAR INTRUSION is there for your car's safety.");
        }

    }
}
