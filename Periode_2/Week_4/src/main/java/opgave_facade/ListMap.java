package opgave_facade;

import java.util.ArrayList;
import java.util.List;

public class ListMap <K, V>{
    List<K> keys;
    List<V> values;

    public ListMap() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void printAll() {
        if (keys.size() != values.size()) {
            System.out.println("niet gelijk");
        } else {
            for (int i = 0; i < keys.size(); i++) {
                System.out.println("Key: " + keys.get(i) + " Value: " + values.get(i));
            }
        }
    }

    public void put(K key, V value) {
        if (get(key) != null) {
            int idx = keys.indexOf(key);
            values.set(idx, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key) {
        if (keys.contains(key)) {
            int idx = keys.indexOf(key);
            return values.get(idx);
        }
        return null;
    }

}
