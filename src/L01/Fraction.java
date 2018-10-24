package L01;

// elab-source: Fraction.java

public class Fraction {
    private int sa;
    private int su;

    public Fraction(int sa, int su) {
        this.sa = sa;
        this.su = su;
    }
    public String show(){
        String s = sa + "/" + su;
        return s;
    }

    public int getSa() {
        return sa;
    }

    public int getSu() {
        return su;
    }

    public void add(Fraction other){
        this.sa = (this.sa * other.su) + (this.su * other.sa);
        this.su = this.su * other.su;
    }
}
