package basic.datastructure.map;

public abstract class AbstractMap<K,V> implements Map<K,V>{

    private int size = 0;

    public int size(){
        return size;

    }

    public boolean isEmpty(){
        if(size==0) return true;
        return false;
    }
}
