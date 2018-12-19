package cashRegisterStrategyPattern;

public class Main {
    public static void main(String[] args) {
        CashRegister caCashRegister = new CACashRegister();
        caCashRegister.recordPurchase(20);
        caCashRegister.recordPurchase(80);
        caCashRegister.calculateTex();
        caCashRegister.enterPayment(200);
        System.out.println(caCashRegister.giveChange());
        System.out.println("===============================");
        CashRegister nyCashRegister1 = new NYCashRegister();
        nyCashRegister1.recordPurchase(2);
        nyCashRegister1.recordPurchase(80);
        nyCashRegister1.calculateTex();
        nyCashRegister1.enterPayment(200);
        System.out.println(nyCashRegister1.giveChange());
        System.out.println("===============================");
        CashRegister nyCashRegister2 = new NYCashRegister();
        nyCashRegister2.recordPurchase(220);
        nyCashRegister2.recordPurchase(80);
        nyCashRegister2.calculateTex();
        nyCashRegister2.enterPayment(1000);
        System.out.println(nyCashRegister2.giveChange());
        System.out.println("===============================");
    }



}
