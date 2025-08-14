package basic.datastructure;

//모든 자료 구조에 기본적으로 들어가야할 메소드
public interface Base<T> {

    /**
     * 자료 구조에 들어있는 데이터의 수
     */
    int getSize();


    /**
     * 자료 구조가 비었는지 확인
     */
    boolean isEmpty();

    /**
     * 자료 구조 속 들어있는 데이터 초기화
     */
    void clear();

}
