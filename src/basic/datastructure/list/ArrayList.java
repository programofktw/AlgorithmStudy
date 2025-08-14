package basic.datastructure.list;

public class ArrayList<T> extends AbstractList<T> implements List<T> {
    private  static final int DEFAULT_SIZE = 10;

    private T[] array;

    @SuppressWarnings("unchecked")
    public ArrayList(){
        array = (T[]) new Object[DEFAULT_SIZE];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int size){
        array = (T[]) new Object[size];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(List<T> array){
        this.array = (T[]) new Object[array.getSize()];

        for(int i = 0 ; i<array.getSize();i++){
            this.array[i] = array.get(i);
        }

        this.size = array.getSize();
    }

    public int getCapacity(){
        return array.length;
    }

    @Override
    public T get(int index) {
        checkOutBoundsIndex(index);

        return array[index];
    }

    @Override
    public T update(int index, T element) {
        checkOutBoundsIndex(index);

        checkNullElement(element);

        T old = array[index];
        
        //특정 인덱스의 값을 변경
        array[index] = element;
        
        return old;
    }

    @Override
    public void delete(int index) {
        checkOutBoundsIndex(index);

        //특정 인덱스의 값을 삭제하고 앞으로 땡김.
        for(int i = index;i<size-1;i++){
            array[i] = array[i+1];
        }

        array[size - 1] = null;
        size--;
    }

    @Override
    public int removeAll(T element) {
        int count=0;
        checkNullElement(element);
        for(int i = 0 ; i < size;i++){
            if(array[i].equals(element)){
                count++;
                delete(i);
                i--;
            }
        }

        return count;
    }

    @Override
    public void remove(T element) {
        checkNullElement(element);
        for(int i = 0 ; i < size;i++){
            if(array[i].equals(element)){
                delete(i);
                break;
            }
        }
    }

    @Override
    public boolean contains(T element) {
        checkNullElement(element);

        for(int i =0 ; i<size;i++){
            if(array[i].equals(element)) return true;
        }

        return false;
    }

    @Override
    public int findFirstIndex(T element) {
        checkNullElement(element);

        for(int i =0 ; i<size;i++){
            if(array[i].equals(element)) return i;
        }
        return -1;
    }



    @SuppressWarnings("unchecked")
    @Override
    public void add(T element) {
        checkNullElement(element);
        if(this.size==array.length){
            T[] temp = (T[]) new Object[(this.size + this.size>>1)];

            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
        }

        array[size++] = element;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void insert(T element, int index) {
        checkOutBoundsInsertIndex(index);

        checkNullElement(element);

        if (size == array.length) {
            T[] temp = (T[]) new Object[size + (size >> 1)];

            if (index >= 0) System.arraycopy(array, 0, temp, 0, index);

            if (size - index >= 0) System.arraycopy(array, index, temp, index + 1, size - index);

            array = temp;

        } else {
            for (int i = size - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
        }

        array[index] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addAll(List<T> elements) {

        int tempSize = elements.getSize() + getSize();
        if(array.length < tempSize){
            T[] temp = (T[]) new Object[tempSize + tempSize>>1];

            System.arraycopy(array, 0, temp, 0, size);

            for(int i = 0 ; i<elements.getSize();i++){
                temp[size+i] = elements.get(i);
            }


            array = temp;
        }else{
            for(int i = 0 ; i<elements.getSize();i++){
                array[size+i] = elements.get(i);
            }
        }
        size = tempSize;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        array = (T[]) new Object[DEFAULT_SIZE];
        size =0;
    }
}
