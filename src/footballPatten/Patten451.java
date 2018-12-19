package footballPatten;

import java.util.ArrayList;
import java.util.Random;

public class Patten451 implements TeamPatten {
    @Override
    public void manage(ArrayList<FootballPlayer> DFGroup, ArrayList<FootballPlayer> FWGroup, ArrayList<FootballPlayer> GKGroup, ArrayList<FootballPlayer> MFGroup) {
        Random randomGenerator = new Random();
        System.out.println("<< DF >>");
        for (int i = 0; i < 4; i++) {
            int index = randomGenerator.nextInt(DFGroup.size());
            System.out.print(DFGroup.get(index) + " ");
        }
        System.out.println("");
        System.out.println("<< MF >>");
        for (int i = 0; i < 5; i++) {
            int index = randomGenerator.nextInt(MFGroup.size());
            System.out.print(MFGroup.get(index) + " ");
        }
        System.out.println("");
        System.out.println("<< FW >>");
        for (int i = 0; i < 1; i++) {
            int index = randomGenerator.nextInt(FWGroup.size());
            System.out.print(FWGroup.get(index) + " ");
        }
        System.out.println("");
        System.out.println("<< GK >>");
        int index = randomGenerator.nextInt(GKGroup.size());
        System.out.println(GKGroup.get(index) + " ");
    }
}
