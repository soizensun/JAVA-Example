package cashRegisterStrategyPattern;

public class CACashRegister extends CashRegister {
    public CACashRegister() {
        texBehavior = new CATexRate();
    }
}
