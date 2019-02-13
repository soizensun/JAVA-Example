package algolithm;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        long two = 1;
        long one = 1;
        long n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n == 0) {
            System.out.println(0);
        }
        else if (n == 1 || n == 2) {
            System.out.println(1);
        }
        else {
            for (int i = 0; i < n - 2; i++) {
                long x;
                x = two + one;
                one = two;
                two = x;
            }
            System.out.println(two);
        }
    }
}
