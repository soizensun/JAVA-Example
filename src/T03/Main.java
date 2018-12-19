package T03;

public class Main {
    public static void main(String[] args) {
        PasswordValidator pass = new DigitValidator() {};


        System.out.println(pass.validate("asd3dfsds"));
    }
}
