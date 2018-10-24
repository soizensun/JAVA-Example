package problem3;


public class Main {
    public static void main(String[] args) {
        Implement3 im = new Implement3();
        im.method1();
        im.method2();

        Face3_1 f1 = im;
        f1.method1();

        Face3_2 f2 = im;
        f2.method2();

        ((Implement3) f1).method2();
        ((Face3_1) f2).method1();

    }
}
