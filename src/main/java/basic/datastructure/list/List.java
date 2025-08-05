package basic.datastructure.list;

import basic.datastructure.Base;

public interface List<T> extends Base<T> {

    /**
     * 특정 인덱스의 값을 반환
     * */
    T get(int index);

    /**
     * 특정 인덱스의 값 수정.
     */
    T update(int index, T element);


    /**
     * 특정 인덱스의 값을 삭제
     */
    void delete(int index);

    /**
     * 특정 element를 전체 삭제
     */
    int removeAll(T element);

    /**
     * 특정 element 중 첫번째 삭제
     */
    void remove(T element);

    /**
     * 특정 값이 존재하는 지 확인
     */
    boolean contains(T element);

    /**
     * 특정 값을 앞에서부터 탐색하여 몇번째 인덱스에 있는지 확인
     * 없으면 -1 반환
     */
    int findFirstIndex(T element);


    /**
     * 특정 값을 맨마지막에 추가
     */
    void add(T element);

    /**
     * 특정 값을 중간에 추가
     */
    void insert(T element, int index);

    /**
     * 리스트 간의 병합.
     * 기존 list 뒤에 병합.
     */
    void addAll(List<T> elements);
}
