package basic.datastructure.list;

public class LinkedList<T> extends AbstractList<T> implements List<T>{

    Node<T> head;

    public LinkedList(){
        head = new Node<>(null);
    }

    private Node<T> findTargetNode(int index){
        Node<T> now = head;

        for(int i = 0;i<index;i++){
            now = head.next;
        }

        return now;
    }

    @Override
    public T get(int index) {
        checkOutBoundsIndex(index);

        Node<T> target = findTargetNode(index);

        return target.elemnet;

    }

    @Override
    public T update(int index, T element) {
        checkOutBoundsIndex(index);

        return null;
    }

    @Override
    public void delete(int index) {
        checkOutBoundsIndex(index);

    }

    @Override
    public int removeAll(T element) {
        return 0;
    }

    @Override
    public void remove(T element) {

    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public int findFirstIndex(T element) {
        return 0;
    }

    @Override
    public int findLastIndex(T element) {
        return 0;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public void insert(T element, int index) {

    }

    @Override
    public void addAll(List<T> elements) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    private class Node<T>{
        T elemnet;
        Node<T> next;

        private Node(T element){
            this.elemnet = element;
            next = null;
        }
    }
}
