package exception;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        num = scanner.nextInt();

        A a = new A(num);
        try {
            a.getI();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
