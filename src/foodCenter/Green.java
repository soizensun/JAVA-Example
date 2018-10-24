package foodCenter;

public class Green extends FoodCenterCard{

    @Override
    public void topUp(double money) {
        super.topUp(money);
        double addition = ((int) (money / 200)) * 10;
        super.topUp(addition);
    }
}
