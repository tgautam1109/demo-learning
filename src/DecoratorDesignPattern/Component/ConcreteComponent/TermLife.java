package src.DecoratorDesignPattern.Component.ConcreteComponent;

import src.DecoratorDesignPattern.Component.Insurance;

public class TermLife implements Insurance {

    private int age;
    private String name;
    private String desc;

    public TermLife(String desc, String name, int age) {
        this.age = age;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public int getPremium() {
        if (0 < age && age < 18)
            return 1000;
        else if (18 <= age && age < 30)
            return  2000;
        else if (30 <= age && age < 40)
            return  3000;
        else if (40 <= age ) {
            return 4000;
        }
        else
            return -1;
    }

    public int getAge() {
        return age;
    }
}
