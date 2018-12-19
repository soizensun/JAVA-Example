package T01;

//elab-source:Main.java
//elab-mainclass:Main
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int round = in.nextInt();

        UIControler uiControler = new UIControler(round);
        try {
            uiControler.run();
            double totalArea = uiControler.getSum();
            System.out.format("%.2f\n", totalArea);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
