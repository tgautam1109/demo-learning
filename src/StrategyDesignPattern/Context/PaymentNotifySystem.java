package src.StrategyDesignPattern.Context;

import src.StrategyDesignPattern.Strategy.InvoiceTypeStrategy;
import src.StrategyDesignPattern.Strategy.PaymentStrategy;

public class PaymentNotifySystem {

    PaymentStrategy paymentStrategy;
    InvoiceTypeStrategy invoiceTypeStrategy;

    public PaymentNotifySystem(PaymentStrategy paymentStrategy, InvoiceTypeStrategy invoiceTypeStrategy){
        this.paymentStrategy = paymentStrategy;
        this.invoiceTypeStrategy = invoiceTypeStrategy;
    }

    public void makePayment()
    {
        paymentStrategy.pay();
    }
    public void generateInvoice(){
        invoiceTypeStrategy.InvoiceType();
    }
}
