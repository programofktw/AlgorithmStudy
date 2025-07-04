package basic.datastructure.list;

public abstract class AbstractList<T> implements List<T>{
    protected int size = 0;

    @Override
    public int getSize(){
        return size;
    }


    protected void checkOutBoundsIndex(int index){
        String errorMessage =  String.format(
                "배열의 size는 %d 입니다. 요청하신 index %d는 배열의 범위를 벗어났습니다.",
                size, index
        );

        if(index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException(errorMessage);
    }

    protected void checkOutBoundsInsertIndex(int index){
        String errorMessage =  String.format(
                "배열의 size는 %d 입니다. 요청하신 index %d는 배열의 범위를 벗어났습니다.",
                size, index
        );

        if(index < 0 || index > size) throw new ArrayIndexOutOfBoundsException(errorMessage);
    }

    protected void checkNullElement(T element){
        if(element==null){
            throw new IllegalArgumentException("null은 입력할 수 없습니다.");
        }
    }
}
