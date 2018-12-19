package cashRegisterObserverParrern;

import java.util.ArrayList;

public class CashRegister implements Sample {
    private double purchase;
    private double payment;
    private double justPurchase;
    ArrayList<Observer> cashRegisterObservers;


    public CashRegister(){
        this.payment = 0;
        this.purchase = 0;
        cashRegisterObservers = new ArrayList<>();
    }

    public double getPurchase() {
        return this.justPurchase;
    }

    public void recordPurchase(double amount){
        this.purchase += amount;
        justPurchase = amount;
    }

    public void enterPayment(double amount){
        payment += amount;
    }

    public double giveChange(){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public void setNoti(){
        notification();
    }

    @Override
    public void registerObserver(Observer observer) {
        cashRegisterObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        cashRegisterObservers.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer o :
                cashRegisterObservers) {
            o.update(this.justPurchase);
        }
    }
}
