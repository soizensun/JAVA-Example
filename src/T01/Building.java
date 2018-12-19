package T01;


//elab-source:Building.java
public class Building implements CalculateArea{
    private double width;
    private double hight;
    private double layer;

    public Building(double width, double hight, double layer) {
        this.width = width;
        this.hight = hight;
        this.layer = layer;
    }

    @Override
    public double calculateArea() {
        return width * hight * layer;
    }
}
