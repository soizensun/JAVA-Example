package T01;


//elab-source:House.java
public class House implements CalculateArea{
    private double waSqArea;

    public House(double waSqArea) {
        this.waSqArea = waSqArea;
    }

    @Override
    public double calculateArea() {
        return waSqArea * 4.00;
    }
}
