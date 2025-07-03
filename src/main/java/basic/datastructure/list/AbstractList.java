package basic.datastructure.list;

public abstract class AbstractList<T> implements List<T>{
    protected int size = 0;

    @Override
    public int getSize(){
        return size;
    }
}
