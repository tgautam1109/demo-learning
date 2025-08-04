package src;

import src.DecoratorDesignPattern.Component.ConcreteComponent.TermLife;
import src.DecoratorDesignPattern.Component.Insurance;
import src.DecoratorDesignPattern.Decorator.ConcreteDecoratorImpl.PremiumInvestmentPlan;
import src.DecoratorDesignPattern.Decorator.ConcreteDecoratorImpl.TerminalIllnessCover;
import src.DecoratorDesignPattern.Decorator.ConcreteDecoratorImpl.WaiverOfPremiumOnAccidentWithPermanentLoss;
import src.ObserverDesignPattern.LastObservers.NotificationType;
import src.ObserverDesignPattern.LastObserversImpl.InAppAlert;
import src.ObserverDesignPattern.LastObserversImpl.SMSAlert;
import src.ObserverDesignPattern.NextObservable_TopLevelObserver_Impl.PersonImpl;
import src.ObserverDesignPattern.TopLevelObservable.IntrusionAlertSystem_Subject;
import src.ObserverDesignPattern.NextObservable_TopLevelObserver.Person;
import src.ObserverDesignPattern.TopLevelObservableImpl.CarIntrusionDetector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //First commit to Git! Hurrayy!
        //HelloWorld helloWorld = new HelloWorld();

       /** // 1 - Strategy Pattern Example
        PaymentNotifySystem paymentNotifySystem = new PaymentNotifySystem(new CreditCardPaymentImpl(), new EmailInvoiceImpl());
        paymentNotifySystem.makePayment();
        paymentNotifySystem.generateInvoice();

        // 2 - SingletonMethod Example
        VehicleOdometer vehicleOdometer1 = VehicleOdometer.getInstance();
        VehicleOdometer vehicleOdometer2 = VehicleOdometer.getInstance();
        System.out.println( vehicleOdometer2 == vehicleOdometer1);
        vehicleOdometer1.getOdometerReading();
        vehicleOdometer1.setOdometerReading();
        vehicleOdometer1.getOdometerReading();

        // 3 - Observer Example(Two Layer Observer Pattern)
        //Concept - CarIntrusionDetector notifies the subscribed persons, those persons get the subscribed notifications.
        IntrusionAlertSystem_Subject subject1 = new CarIntrusionDetector(true);
        Person person1 = new PersonImpl("Tushar",subject1);
        NotificationType smsNotification = new SMSAlert(person1);
        NotificationType inApp = new InAppAlert(person1);

        Person person2 = new PersonImpl("Gautam", subject1);
         smsNotification = new SMSAlert(person2);

        Person person3 = new PersonImpl("Tushar's Father",subject1);
        //person3.add(new SMSAlert(person3));
        subject1.checkEvent(); **/

        // 4 - Decorator Example
        Insurance insurance = new TermLife("Term Life Insurance","Tushar", 29);
        System.out.println(insurance.getDescription());
        System.out.println(insurance.getPremium());

        insurance = new PremiumInvestmentPlan(insurance);
        System.out.println(insurance.getDescription());
        System.out.println(insurance.getPremium());

        insurance = new WaiverOfPremiumOnAccidentWithPermanentLoss(insurance);
        System.out.println(insurance.getDescription());
        System.out.println(insurance.getPremium());

        insurance = new TerminalIllnessCover(insurance);
        System.out.println(insurance.getDescription());
        System.out.println(insurance.getPremium());
    }
}
