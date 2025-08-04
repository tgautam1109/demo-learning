package src.DecoratorDesignPattern.Decorator.ConcreteDecoratorImpl;


import src.DecoratorDesignPattern.Component.Insurance;
import src.DecoratorDesignPattern.Decorator.AddOns_Decorator;

public class WaiverOfPremiumOnAccidentWithPermanentLoss implements AddOns_Decorator {

    Insurance insurance;

    public WaiverOfPremiumOnAccidentWithPermanentLoss(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String getDescription() {
        return insurance.getDescription() + ", waiver of premium on Accident with permanent loss";
    }

    @Override
    public int getPremium() {
        return insurance.getPremium() + 200;
    }

}
