package src.StrategyDesignPattern.Strategy.PaymentStrategyImpl;

import src.StrategyDesignPattern.Strategy.PaymentStrategy;

public class UPIPaymentImpl implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Payment has been done from UPI mode");
    }
}
