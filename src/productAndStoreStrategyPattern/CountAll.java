package productAndStoreStrategyPattern;

public class CountAll implements Counter {
    @Override
    public int counter(Product p) {
        return 1;
    }
}
