import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> storage;
    private Map<String, Integer> stockStorage;

    public Storehouse() {
        this.storage = new HashMap<String, Integer>();
        this.stockStorage = new HashMap<String, Integer>();
    }

    // adds product to corresponding Map
    public void addProduct(String product, int price, int stock) {
        this.storage.put(product, price);
        this.stockStorage.put(product, stock);
    }

    // checks and return if product is available
    public int price(String product) {
        if (this.storage.containsKey(product)) {
            return this.storage.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stockStorage.containsKey(product)) {
            return this.stockStorage.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.stockStorage.containsKey(product) && this.stockStorage.get(product) > 0) {
            this.stockStorage.put(product, this.stockStorage.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> products = new HashSet<String>();

        for (String key : this.storage.keySet()) {
            products.add(key);
        }
        return products;
    }
}