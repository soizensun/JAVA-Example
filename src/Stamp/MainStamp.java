package Stamp;

// elab-source: MainStamp.java
// elab-mainclass: MainStamp

import java.util.Scanner;

public class MainStamp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stamp stamp = new Stamp();
        int count = scanner.nextInt();

        for(int i = 0; i < count; i++){
            double p = scanner.nextDouble();
            stamp.setTotal(p);
            stamp.calculate();
        }

        System.out.println(stamp.getStamp());
    }
}
