package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        int num1;
        String s;
        float f;
        num = scanner.nextInt();
        num1 = scanner.nextInt();
        s = scanner.nextLine();
        f = scanner.nextFloat();
        System.out.println("num = " + num);
        System.out.println(num1);
        System.out.println("s = " + s);
        System.out.println("f = " + f);

        Super su = new Sub();
//      We can use method that it is in the Super
//      but use in Sub.

        System.out.println(su.getI());
//        su.aMethod();


    }
}
