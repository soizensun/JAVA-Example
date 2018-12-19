package testCallBack;

public class Order implements Texable{
    private String date;
    private double orderAmount;

    public Order(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void addAmount(double amount) {
        orderAmount += amount;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    @Override
    public double getTex() {
        return getOrderAmount() * 0.07;
    }
}
