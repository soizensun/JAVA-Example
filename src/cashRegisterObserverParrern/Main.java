package cashRegisterObserverParrern;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();

        GUIObserver guiObserver = new GUIObserver();
        FileObserver fileObserver = new FileObserver();
        register.registerObserver(fileObserver);
        register.registerObserver(guiObserver);

        register.recordPurchase(60);
        register.setNoti();

        register.recordPurchase(40);
        register.setNoti();
        register.enterPayment(200);
        System.out.println("Your change : " + register.giveChange());

        register.recordPurchase(25);
        register.setNoti();
        register.recordPurchase(105);
        register.setNoti();
        register.enterPayment(200);
        System.out.println("Your change : " + register.giveChange());

        register.recordPurchase(25);
        register.setNoti();
        register.recordPurchase(105);
        register.setNoti();
        register.enterPayment(200);
        System.out.println("Your change : " + register.giveChange());


    }
}
