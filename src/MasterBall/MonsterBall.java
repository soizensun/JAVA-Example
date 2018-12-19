package MasterBall;

// elab-source: MonsterBall.java

public class MonsterBall {
    private String masterBallType;
    private double price;
    private double sellFor;
    private double ballValue;

    public MonsterBall(String masterBallType, double price, double sellFor, double ballValue) {
        this.masterBallType = masterBallType;
        this.price = price;
        this.sellFor = sellFor;
        this.ballValue = ballValue;
    }

    public String getMasterBallType() {
        return masterBallType;
    }
    public double getPrice() {
        return price;
    }
    public double getSellFor() {
        return sellFor;
    }
    public double getBallValue() {
        return ballValue;
    }

    public String toString() {
        String s = 	"MonsterBall{type='"+getMasterBallType()+"', price="+getPrice()+", sellFor="+getSellFor()+", ballValue="+getBallValue()+"}" ;
        return s ;
    }
}
