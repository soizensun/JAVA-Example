package productAndStoreStrategyPattern;

public class CountInStock implements Counter {

    @Override
    public int counter(Product p) {
        if(p.getQuantity() <= 0){
            return 0;
        }
        else  return 1;
    }
}
