package test;
import Object.* ;
import behavior.impl.FlyWithWings;
import behavior.impl.Quack;

public class DuckTest {
    public static void main(String[] args){
        Duck mallard = new MallardDuck() ;

        //更改行为前
        mallard.performFly();
        mallard.performQuack();

        //更改行为
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());

        //更改行为后
        mallard.performFly();
        mallard.performQuack();
    }
}
