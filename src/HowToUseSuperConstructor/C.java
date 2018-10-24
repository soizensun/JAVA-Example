package HowToUseSuperConstructor;

public class C extends A {
    B b = new B();
    public C() {
        System.out.println("C constructor");
//        System.out.println(i);
    }
}
