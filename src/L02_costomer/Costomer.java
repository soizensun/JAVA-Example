package L02_costomer;

public class Costomer {
    private int amoutStamp;
    private int price;

    public Costomer(int price) {
        this.price = price;
        this.amoutStamp = 0;
    }

    public void calulate(){
        int n;
        n = this.price / 50;
        this.amoutStamp += n;
    }

    public int getAmoutStamp() {
        return amoutStamp;
    }
}
