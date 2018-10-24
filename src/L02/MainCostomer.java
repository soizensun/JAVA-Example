package L02;

import java.io.*;

public class MainCostomer {
    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int  n = Integer.parseInt(str.readLine());

        Costomer costomer = new Costomer(n);
        costomer.calulate();

        System.out.print("You have :");
        System.out.println(costomer.getAmoutStamp());
    }
}
