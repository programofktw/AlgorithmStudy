package basic.sort.impl;

import basic.sort.Sort;

/*
버블소트
마치 공기방울이 떠오르 듯이 정렬하는 방식
해당 각 케이스 별 결과물로는 정렬되지 않은 배열에서 가장 큰 수가 맨 뒤로 배치
항시 O(N^2)의 시간 복잡도를 가짐.

핵심 포인트 Case를 반복하면서 가장 큰 수가 뒤에 배치
 */
public class Bubble implements Sort {
    @Override
    public void sort(int[] array) {
        for(int i= 0; i<array.length-1;i++){
            System.out.println("Case "+i);
            //버블 소트의 결과물로는 큰 수가 맨 뒤에 배치가 되기 떄문에
            for(int j = 0 ;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    printAllArray(array, 0);
                }
            }
        }
    }
}
