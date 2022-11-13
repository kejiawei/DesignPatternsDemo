package behavior.impl;

import behavior.itf.FlyBehavior;

public class FlyNoWays implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly!!@@");
    }
}
