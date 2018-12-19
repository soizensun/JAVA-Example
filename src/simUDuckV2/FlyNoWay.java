package simUDuckV2;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void flying() {
        System.out.println("can't fly");
    }
}
