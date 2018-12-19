package MasterMind;

// elab-source: MainMasterMind.java
// elab-mainclass: MainMasterMind

import java.util.Scanner;

public class MainMasterMind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int player1 = scanner.nextInt();
        int player2 = scanner.nextInt();

        MasterMind masterMind = new MasterMind(player1, player2);
        masterMind.checkAll();
//        System.out.println(masterMind.getcDigit());
//        System.out.println(masterMind.getcPosition());
        System.out.println(masterMind.getPromt());
    }
}
