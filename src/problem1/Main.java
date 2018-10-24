package problem1;

public class Main {
    public static void main(String[] args) {
        Implement1 im = new Implement1();
        im.data = 0;
        im.method1();

        Face1 f1 = im;
        f1.method1();
    }
}
