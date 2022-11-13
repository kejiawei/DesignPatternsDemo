package Object;

import behavior.itf.FlyBehavior;
import behavior.itf.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior ;
    QuackBehavior quackBehavior ;

    //构造方法
    public Duck(){}

    public abstract void display() ;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    //更换行为
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb ;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb ;
    }

    public void swim(){
        System.out.println("All Duck float, even decoys!");
    }  ;
}
