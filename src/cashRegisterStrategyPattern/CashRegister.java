package cashRegisterStrategyPattern;

public class CashRegister {
    private double purchase;
    private double payment;
    TexBehavior texBehavior;


    public CashRegister(){
        this.payment = 0;
        this.purchase = 0;
    }

    public void recordPurchase(double amount){
        this.purchase += amount;
    }

    public void calculateTex(){ //performFly
        purchase = purchase + texBehavior.calcuTex(this.purchase);
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
}
