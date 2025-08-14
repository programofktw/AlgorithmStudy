package basic.datastructure.map;

import basic.datastructure.list.ArrayList;

public class HashMap<K,V> extends AbstractMap<K,V> {

    int size = 0;

    private ArrayList<Node> hashMap;

    private final int DEFAULT_SIZE = 16;

    private final double LOAD_FACTOR = 0.75;

    public HashMap(){
        this.hashMap = new ArrayList<>(DEFAULT_SIZE);

        for(int i = 0 ; i < hashMap.getCapacity(); i++){
            hashMap.add(new Node(null,null));
        }
    }

    @Override
    public void put(K key, V value) {
        checkNullKey(key);
        int hash = hash(key);

        Node node = hashMap.get(hash);

        while(node.next!=null){
            node = node.getNext();
            if(node.getKey().equals(key)){
                node.setValue(value);
                return;
            }
        }

        node.setNext(new Node(key,value));
        size++;
    }

    @Override
    public boolean containsKey(K key) {
        checkNullKey(key);
        int hash = hash(key);

        Node node = hashMap.get(hash).getNext();

        while(node != null){
            if(node.getKey().equals(key)){
                return true;
            }
            node = node.getNext();
        }

        return false;
    }

    @Override
    public V get(K key) {
        checkNullKey(key);
        int hash = hash(key);

        Node node = hashMap.get(hash).getNext();

        while(node!=null){
            if(node.getKey().equals(key)){
                return node.getValue();
            }
            node = node.getNext();
        }

        return null;
    }

    @Override
    public V remove(K key) {
        checkNullKey(key);
        int hash = hash(key);

        Node pre = hashMap.get(hash);
        Node node = pre.next;
        while(node != null){
            if(node.key.equals(key)){
                pre.setNext(node.getNext());
                size--;
                return node.value;
            }
            pre = node;
            node = node.getNext();
        }

        return null;
    }

    @Override
    public void clear() {
        hashMap = new ArrayList<>(DEFAULT_SIZE);

        for(int i = 0 ; i < hashMap.getCapacity();i++){
            hashMap.add(new Node(null,null));
        }

        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    private int hash(K key){
        return Math.abs(key.hashCode()) % hashMap.getCapacity();
    }

    private class Node implements Map.Entry<K,V>{

        private K key;

        private V value;

        private Node next;

        Node(K key, V value){
            this.key = key;

            this.value = value;

            this.next = null;
        }

        public Node getNext() { return this.next;}

        public void setNext(Node next) { this.next = next;}

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
