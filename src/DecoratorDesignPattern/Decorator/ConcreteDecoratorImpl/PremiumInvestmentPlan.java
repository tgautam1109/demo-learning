package src.DecoratorDesignPattern.Decorator.ConcreteDecoratorImpl;

import src.DecoratorDesignPattern.Component.Insurance;
import src.DecoratorDesignPattern.Decorator.AddOns_Decorator;

public class PremiumInvestmentPlan implements AddOns_Decorator {

    Insurance insurance;

    public PremiumInvestmentPlan(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String getDescription() {
        return insurance.getDescription() + " with Premium Investment plan";
    }

    @Override
    public int getPremium() {
        return insurance.getPremium() + 100;
    }

}
