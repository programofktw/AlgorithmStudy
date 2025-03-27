package basic.sort.impl;

import basic.sort.Sort;

/*
삽입 정렬
- 2번째 부터 자기 위치에 찾아가는 것을 반복하는 정렬 방식
    = 이때 자신의 위치를 찾아간다는 것은 현재 자신의 위치보다 앞에 존재하는 정렬된 수 사이에 자기보다 작은수 자신 큰수 로 정렬되는 위치에 삽입하는 방식
    = 삽입은 자신보다 큰 수들을 하나씩 뒤로 밀어야해서 swap이 많이 일어남.
- 최악의 경우 O(n^2)의 시간 복잡도를 가지지만 정렬이 되어있는 경우 빠를 수도 있음
    = 근데 정렬이 되어 있을 것이라는 보장이 없기에 퀵 정렬이 더 좋음.
 */
public class Insert implements Sort {


    @Override
    public void sort(int[] array) {

        for(int i =1;i<array.length;i++){
            int now = array[i];
            int start = i;
            for(int j = i-1 ; j>=0;j--){
                if(array[j]>now) start=j;
                else break;
            }
            swapAll(array,start,i);

            printAllArray(array,i);
        }
    }

    public void swapAll(int[] array, int start, int end){
        int temp = array[end];

        for(int i = end; i > start ; i--){
            array[i] = array[i-1];
        }

        array[start] = temp;
    }
}
