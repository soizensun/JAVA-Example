package productAndStoreStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("big java", 200, 5);
        store.addProduct("big java1", 200, 0);
        store.addProduct("big java2", 200, 10);

        int i = store.counter(new CountAll());
        int o = store.counter(new CountInStock());
        System.out.println(i);
        System.out.println(o);
    }
}
