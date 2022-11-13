package Object;

import behavior.impl.FlyNoWays;
import behavior.impl.MuteQuack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyNoWays() ;
        quackBehavior = new MuteQuack() ;
    }

    @Override
    public void display() {
        System.out.println("I'm a real MallardDuck!");
    }
}
