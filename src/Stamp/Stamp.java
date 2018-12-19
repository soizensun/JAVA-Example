package Stamp;

// elab-source: Stamp.java

public class Stamp {
    private double total;
    private int stamp;

    public Stamp() {
        this.total = 0;
        this.stamp = 0;
    }

    public void setTotal(double total) {
        this.total += total;
    }

    public void calculate(){
        this.stamp = (int)(total / 50);
    }

    public int getStamp() {
        return stamp;
    }
}
