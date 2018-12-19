package MemberCard;

import java.util.Scanner;

public class MemberCardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pointable memberPoint = new MemberCard("Alice Bob");

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double price = scanner.nextDouble();
            memberPoint.addScore(price);
        }
        System.out.println("Point in MemberCard: " + memberPoint.getPoint());
        System.out.println("MemberCard info: " + memberPoint.getInfo());


        int pointToUse = scanner.nextInt();
        memberPoint.usePoint(pointToUse);
        System.out.println("Point in MemberCard after use: " + memberPoint.getPoint());
        System.out.println("MemberCard info: " + memberPoint.getInfo());
    }
}
