package basic.datastructure.list;

public class LinkedList<T> extends AbstractList<T> implements List<T>{

    Node<T> head;

    public LinkedList(){
        head = new Node<>(null);
    }

    private Node<T> findTargetNode(int index){
        Node<T> now = head;

        if(index == -1) return now;

        for(int i = 0;i<=index;i++){
            now = now.next;
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
        checkNullElement(element);

        Node<T> target = findTargetNode(index);

        target.elemnet = element;

        return element;
    }

    @Override
    public void delete(int index) {
        checkOutBoundsIndex(index);

        Node<T> pre = findTargetNode(index-1);
        Node<T> target = pre.next;

        pre.next = target.next;

        size--;
    }

    @Override
    public int removeAll(T element) {
        checkNullElement(element);
        Node<T> now = head.next;
        Node<T> pre = head;
        int count=0;
        while (now != null) {
            if (now.elemnet.equals(element)) {
                pre.next = now.next;
                now = now.next;
                count++;
                size--;
            } else {
                pre = now;
                now = now.next;
            }
        }

        //삭제 개수 반환
        return count;
    }

    @Override
    public void remove(T element) {
        checkNullElement(element);
        Node<T> now = head.next;
        Node<T> pre = head;

        while (now != null) {
            if (now.elemnet.equals(element)) {
                pre.next = now.next;
                now = now.next;
                size--;
                return;
            } else {
                pre = now;
                now = now.next;
            }
        }
    }

    @Override
    public boolean contains(T element) {
        checkNullElement(element);
        Node<T> now = head.next;

        while (now != null) {
            if (now.elemnet.equals(element)) {
                return true;
            }
            now = now.next;

        }
        return false;
    }

    @Override
    public int findFirstIndex(T element) {
        checkNullElement(element);

        Node<T> now = head.next;

        int i = 0;
        while (now != null) {
            if (now.elemnet.equals(element)) {
                return i;
            }
            now = now.next;
            i++;
        }
        return -1;
    }


    @Override
    public void add(T element) {
        checkNullElement(element);

        Node<T> lastNode = findTargetNode(size-1);

        lastNode.next = new Node<>(element);
        size++;
    }

    @Override
    public void insert(T element, int index) {
        checkNullElement(element);

        Node<T> pre = findTargetNode(index-1);
        Node<T> target = pre.next;

        pre.next = new Node<>(element);

        pre.next.next = target;

        size++;
    }

    @Override
    public void addAll(List<T> elements) {
        Node<T> lastNode = findTargetNode(size-1);

        if (elements.getSize() == 0) return;

        for(int i =0 ; i<elements.getSize();i++){
            lastNode.next = new Node<>(elements.get(i));
            lastNode = lastNode.next;
            size++;
        }
    }

    @Override
    public void clear() {
        head = new Node<T>(null);
        size= 0;

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
