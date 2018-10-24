package L03;

import java.io.*;

public class MainNumberGame {
    public static void main(String[] args) throws IOException {

        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int  n = Integer.parseInt(str.readLine());
        int ran = (int )(Math.random() * 100 + 1);

        NumberGame numberGame = new NumberGame(ran, n);
        numberGame.compare();

        System.out.print("Target : ");
        System.out.println(numberGame.getTarget());
    }
}
