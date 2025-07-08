package basic.datastructure.map;

public interface Map<K,V> {

    void put(K key, V value);

    boolean containsKey(K key);

    V get(K key);

    V remove(K key);

    void clear();

    int size();

    boolean isEmpty();



}
