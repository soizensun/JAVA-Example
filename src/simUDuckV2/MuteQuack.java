package simUDuckV2;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quacking() {
        System.out.println("not quack");
    }
}
