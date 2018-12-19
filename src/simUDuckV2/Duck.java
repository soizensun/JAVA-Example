package simUDuckV2;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.flying();
    }

    public void performQuack(){
        quackBehavior.quacking();
    }

    public void setFlyBehavior(FlyBehavior fly){
        flyBehavior = fly;
    }

//    public void setQuackBehavior(QuackBehavior quack){
//        quackBehavior = quack;
//    }

    public abstract void display();

    public void swim(){
        System.out.println("swim");
    }
}
