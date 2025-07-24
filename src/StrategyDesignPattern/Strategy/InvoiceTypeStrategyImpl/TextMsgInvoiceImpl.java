package src.StrategyDesignPattern.Strategy.InvoiceTypeStrategyImpl;

import src.StrategyDesignPattern.Strategy.InvoiceTypeStrategy;

public class TextMsgInvoiceImpl implements InvoiceTypeStrategy {


    @Override
    public void InvoiceType() {
        System.out.println("Invoice sent thru text msg to customer. Thank you! ");
    }
}
