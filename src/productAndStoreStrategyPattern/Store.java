package productAndStoreStrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<Product>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public int counter(Counter counter){
        int count = 0;
        for (Product p: products) {
            count += counter.counter(p);
        }
        return count;
    }

    public void addProduct(String name, double price, int qu) {
        products.add(new Product(name, price, qu));
    }
}
