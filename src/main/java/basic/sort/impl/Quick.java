package basic.sort.impl;


import basic.sort.Sort;

/*
   기본 원리 : 특정 pivot을 중심으로
   왼쪽에는 작은 수를 오른쪽은 큰수로 지정한다.
   그럼 pivot을 기준으로 왼쪽, 오른쪽을 또 Quick Sort 적용
   그렇게 순차적으로 반복해 모든 수를 정렬한다.
 */
public class Quick implements Sort {


    @Override
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }

    public void quickSort(int[] array, int start, int end){
        if(start>=end) return;


        //정렬 하고자 하는 원소 중 맨 앞을 pivotIndex로 설정
        int pivotIndex = start;
        //pivot을 저장.
        int pivot = array[pivotIndex];


        //해당 포인터에는 pivot보다 작은 애만 있어야함(만약 크다면 swap 필요)
        int low = pivotIndex+1;


        //해당 포인터에는 pivot보다 큰 애만 있어야함(만약 작다면 swap 필요)
        int high = end;

        while(high>=low){
            if(array[low]>pivot&&array[high]<pivot){
                swap(array,high,low);
            }
            if(array[high]>=pivot){
                high--;
            }
            if(array[low]<=pivot){
                low++;
            }
        }

        swap(array,pivotIndex,high);
        printAllArray(array,pivot);
        pivotIndex =high;
        quickSort(array,start,pivotIndex-1);
        quickSort(array,pivotIndex+1,end);
    }


}
