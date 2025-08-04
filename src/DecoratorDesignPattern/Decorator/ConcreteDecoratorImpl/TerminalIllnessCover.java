package src.DecoratorDesignPattern.Decorator.ConcreteDecoratorImpl;

import src.DecoratorDesignPattern.Component.Insurance;
import src.DecoratorDesignPattern.Decorator.AddOns_Decorator;

public class TerminalIllnessCover implements AddOns_Decorator {

    Insurance insurance;

    public TerminalIllnessCover(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String getDescription() {
        return insurance.getDescription() + ", Terminal illness covered";
    }

    @Override
    public int getPremium() {
        return insurance.getPremium() + 300;
    }

}
