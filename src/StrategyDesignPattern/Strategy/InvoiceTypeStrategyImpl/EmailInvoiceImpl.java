package src.StrategyDesignPattern.Strategy.InvoiceTypeStrategyImpl;

import src.StrategyDesignPattern.Strategy.InvoiceTypeStrategy;

public class EmailInvoiceImpl implements InvoiceTypeStrategy {
    @Override
    public void InvoiceType() {
        System.out.println("Invoice email sent to customer. Thank you!");
    }
}
