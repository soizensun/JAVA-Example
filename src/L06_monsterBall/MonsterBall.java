package L06_monsterBall;

public class MonsterBall {
    private int price;
    private int sell;
    private int value;

    public MonsterBall(int price, int sell, int value) {
        this.price = price;
        this.sell = sell;
        this.value = value;
    }

    public int getPrice() {
        return price;
    }

    public int getSell() {
        return sell;
    }

    public int getValue() {
        return value;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
