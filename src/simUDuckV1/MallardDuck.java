package simUDuckV1;

public class MallardDuck extends Duck implements Flyable{
    @Override
    public void display() {
        System.out.println("Mallard duck display");
    }

    @Override
    public void flying() {
        System.out.println("MallerDuck is flying");
    }
}
