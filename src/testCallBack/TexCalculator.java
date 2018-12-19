package testCallBack;


public abstract class TexCalculator {
    public static double calculateTex(Texable[] objects){
        double totalTex = 0.0;
        for (Texable o : objects) {
            totalTex += o.getTex();
        }
        return totalTex;
    }
}
