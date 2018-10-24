package exception;

public class A {
    private int i;

    public A(int i) {
        this.i = i;
    }

    public int getI() throws Exception {
        if(i < 10){
            throw new Exception("less than 10");
        }
        else if(i > 20){
            throw new Exception("more than 20");
        }
        return i;
    }
}
