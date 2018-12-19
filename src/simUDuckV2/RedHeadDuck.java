package simUDuckV2;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWing();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("red head duck display");
    }

}
