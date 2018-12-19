package simUDuckV2;

public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck redHeadDuck = new RedHeadDuck();

        redHeadDuck.performFly();
        rubberDuck.performFly();
        System.out.println("---------------------------");
        redHeadDuck.performQuack();
        rubberDuck.performQuack();
        System.out.println("---------------------------");

        // change behavior
        redHeadDuck.setFlyBehavior(new Jetfly());
        redHeadDuck.performFly();

    }



}
