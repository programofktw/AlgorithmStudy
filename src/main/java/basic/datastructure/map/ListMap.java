package basic.datastructure.map;

import basic.datastructure.list.ArrayList;

public class ListMap<K,V> extends AbstractMap<K, V> {

    ArrayList<Node<K,V>> list;

    public ListMap(){
        list = new ArrayList<>();
    }

    private int findIndexByKey(K key){
        checkNullKey(key);
        for(int i =0 ;i<list.getSize();i++){
            if(list.get(i).key.equals(key)){
                return i;
            }
        }

        return -1;
    }

    @Override
    public void put(K key, V value) {
        checkNullKey(key);
        int index = findIndexByKey(key);

        if(index==-1) list.add(new Node<>(key,value));

        else list.get(index).setValue(value);
    }

    @Override
    public boolean containsKey(K key) {
        checkNullKey(key);
        return findIndexByKey(key)!=-1;
    }

    @Override
    public V get(K key) {
        checkNullKey(key);
        int index = findIndexByKey(key);

        return (index!=-1)?list.get(index).getValue():null;

    }

    @Override
    public V remove(K key) {
        checkNullKey(key);
        int index = findIndexByKey(key);

        if(index==-1) return null;
        else{
            V value = list.get(index).getValue();
            list.remove(list.get(index));
            return value;
        }

    }

    @Override
    public void clear() {
        list = new ArrayList<>();
    }

    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.getSize()==0;
    }

    private class Node implements Map.Entry<K,V>{

        private K key;

        private V value;

        Node(K key, V value){
            this.key = key;

            this.value = value;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return this.value;
        }
    }
}
