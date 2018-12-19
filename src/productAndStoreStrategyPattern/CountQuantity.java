package productAndStoreStrategyPattern;

public class CountQuantity implements Counter {
    @Override
    public int counter(Product p) {
       return p.getQuantity();
    }
}
