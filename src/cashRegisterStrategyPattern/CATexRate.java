package cashRegisterStrategyPattern;

public class CATexRate implements TexBehavior {

    @Override
    public double calcuTex(double purchase) {
        double tex;
        tex = purchase * 0.075;
        return tex;
    }
}
