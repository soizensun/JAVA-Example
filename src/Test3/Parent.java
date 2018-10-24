package Test3;

public class Parent {
    private void method1(){
        System.out.println("Parent method1");
    }
    public void method2(){
        System.out.println("Parent method2");
        method1();
    }
}
