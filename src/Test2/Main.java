package Test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Base b = new Derive();

        System.out.println(b.i);
        b.amethod();

    }
}
