package foodCenter;

public class FoodCenterCardReader {
    private double price;
    private double total;

    public double getTotal() {
        return total;
    }

    public void setPoint(double price){
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void read(FoodCenterCard card){
        card.spend(price);
        System.out.println("Balance: " + card.getBalance());
        price = 0;
        total += price;
    }

    public void readPoint(FoodCenterCard card){
        ((Blue) card).usePoint((int) price);
        System.out.println("Point : " + ((Blue) card).getPoint());
        total += price;
        price = 0;
    }
}
