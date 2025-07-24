package src.StrategyDesignPattern.Strategy.InvoiceTypeStrategyImpl;

import src.StrategyDesignPattern.Strategy.InvoiceTypeStrategy;

public class HardCopyInvoiceImpl implements InvoiceTypeStrategy {
    @Override
    public void InvoiceType() {
        System.out.println("Invoice printed on paper and given to customer. Thank you!");
    }
}
