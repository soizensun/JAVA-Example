package cashRegisterStrategyPattern;

public class NYCashRegister extends CashRegister {
    public NYCashRegister() {
        texBehavior = new NYTexRate();
    }
}
