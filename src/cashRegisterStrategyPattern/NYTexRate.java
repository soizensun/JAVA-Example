package cashRegisterStrategyPattern;

public class NYTexRate implements TexBehavior {
    @Override
    public double calcuTex(double purchase) {
        double tex;
        if(purchase <= 100) return 0;
        else{
            tex = purchase * 0.08;
            return tex;
        }
    }
}
