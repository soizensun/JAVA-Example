package Guessor;

// elab-source: MainGuessor.java
// elab-mainclass: MainGuessor

import java.util.Scanner;

public class MainGuessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = scanner.nextInt();
        int n = scanner.nextInt();
        Guessor guessor = new Guessor(target);

        for (int i = 0; i < n; i++) {
            int des = scanner.nextInt();

            System.out.println(guessor.calaulate(des));
//            System.out.println(guessor.getPompt());
        }
    }
}
