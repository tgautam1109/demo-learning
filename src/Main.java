package src;

import src.SingletonDesignPattern.VehicleOdometer;
import src.StrategyDesignPattern.Context.PaymentNotifySystem;
import src.StrategyDesignPattern.Strategy.InvoiceTypeStrategyImpl.EmailInvoiceImpl;
import src.StrategyDesignPattern.Strategy.PaymentStrategyImpl.CreditCardPaymentImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //First commit to Git! Hurrayy!
        //HelloWorld helloWorld = new HelloWorld();

        //Strategy Pattern Example
        PaymentNotifySystem paymentNotifySystem = new PaymentNotifySystem(new CreditCardPaymentImpl(), new EmailInvoiceImpl());
        paymentNotifySystem.makePayment();
        paymentNotifySystem.generateInvoice();

        //SingletonMethod Example
        VehicleOdometer vehicleOdometer1 = VehicleOdometer.getInstance();
        VehicleOdometer vehicleOdometer2 = VehicleOdometer.getInstance();
        System.out.println( vehicleOdometer2 == vehicleOdometer1);
        vehicleOdometer1.getOdometerReading();
        vehicleOdometer1.setOdometerReading();
        vehicleOdometer1.getOdometerReading();

    }
}
