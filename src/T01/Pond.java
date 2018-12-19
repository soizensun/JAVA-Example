package T01;


//elab-source:Pond.java
public class Pond implements CalculateArea {
    private double r;

    public Pond(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
