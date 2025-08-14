package basic.datastructure.map;

public abstract class AbstractMap<K,V> implements Map<K,V>{

    protected void checkNullKey(K key){
        if(key==null) throw new NullPointerException();
    }
}
