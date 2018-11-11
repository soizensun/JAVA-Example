package L04_masterMind;

import java.io.*;

public class MainMasterMind {
    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int p1 = Integer.parseInt(str.readLine());
        int p2 = Integer.parseInt(str.readLine());
        MasterMind masterMind = new MasterMind(p1, p2);

        masterMind.check();
    }
}
