package src.StrategyDesignPattern.Strategy.PaymentStrategyImpl;

import src.StrategyDesignPattern.Strategy.PaymentStrategy;

public class CreditCardPaymentImpl implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment has been made thru Credit Card mode");
    }
}
