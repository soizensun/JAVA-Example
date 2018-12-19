package simUDuckV1;

public class RedHeadDuck extends Duck implements Flyable{
    @Override
    public void display() {
        System.out.println("red head duck display");
    }

    @Override
    public void flying() {
        System.out.println("Red head duck is flying");
    }
}
