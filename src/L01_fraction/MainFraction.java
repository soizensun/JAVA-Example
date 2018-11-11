package L01_fraction;

// elab-source: MainFraction.java
// elab-mainclass: MainFraction

import java.io.*;
import java.util.Scanner;

public class MainFraction {
    public static void main(String[] args) throws IOException {

        // 1. รับ input
        // 2. สร้าง object
        // 3. ส่งค่าให้ object
        // 4. แสดงผลลัพธ์จาก object

        // ไม่ทำใน main


        Scanner scanner = new Scanner(System.in);
        int sa1, su1, sa2, su2;
        sa1 = scanner.nextInt();
        su1 = scanner.nextInt();
        sa2 = scanner.nextInt();
        su2 = scanner.nextInt();


//        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter numerator1 : ");
//        int  sa1 = Integer.parseInt(str.readLine());
//        System.out.print("Enter denominator1 :");
//        int  su1 = Integer.parseInt(str.readLine());

        Fraction fraction = new Fraction(sa1, su1);

//        System.out.print("Enter numerator2 : ");
//        int  sa2 = Integer.parseInt(str.readLine());
//        System.out.print("Enter denominator2 :");
//        int  su2 = Integer.parseInt(str.readLine());

        Fraction fraction2 = new Fraction(sa2, su2);

        fraction.add(fraction2);
        String show = fraction.show();
        System.out.println(show);
    }
}

