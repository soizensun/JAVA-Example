package foodCenter;

public class Blue extends FoodCenterCard {
    private int point;

    public int getPoint() {
        return point;
    }

    public void usePoint(int point){
        if(point > this.point){
            throw new IllegalArgumentException("point is insufficient");
        }
        this.point -= point;
    }

    @Override
    public void topUp(double money) {
        super.topUp(money);
        point += ((int) (money / 200) * 10);
        // 200 ถูกเปลี่ยนเป็น 200.00 เรียกว่า implicit type casting หรือ coerced (เปลี่ยนจาก เล็ก -> ใหญ่)
        // (int) เรียกว่า explicit type casting
    }

    @Override
    public void spend (double purchase){
        super.spend(purchase);
        point += ((int) (purchase / 50) * 2);
    }
}
