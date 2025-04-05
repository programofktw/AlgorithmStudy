package basic.sort.impl;

import basic.sort.Sort;


/*
    나누고 합치면서 정렬을 진행하는 것.
    최우선 순위로 입력값들을 하나씩 쪼개고
    그것들을 합치면서 정렬을 진행함.
 */
public class Merge implements Sort {
    @Override
    public void sort(int[] array) {
        // N 이 10 개면 array의 범위는 0 ~ 9
        merge(array,0,array.length-1);

        printAllArray(array,1);
    }


    public void merge(int[] array, int start, int end){
        if(start == end) return;

        else{
            int mid = (end+start)/2;
            merge(array, start,mid);
            merge(array, mid+1,end);

            int[] temp = new int[end-start+1];

            //나눈 것 중 앞쪽의 index
            int front = start;


            //나눈 것 중 뒷쪽의 index
            int back = mid+1;

            int i = 0;

            //정렬 방식은
            //start ~ end 까지의 수를 포함하는 임시 temp를 두고
            //앞부분 vs 뒷부분을 비교하여 작은 수를 temp에 순서대로 저장하는 방식

            while(true){
                //만약 front 범위를 다 넣었을 때
                if(front > mid){
                    //현재의 back부터 end까지
                    for(int j=back;j<=end;j++){
                        temp[i++] = array[j];
                    }
                    printAllArray(temp,-1);
                    break;
                }
                //만약 front의 범위를 다 넣었을 때
                else if(back > end){
                    //남은 front ~ (end+
                    for(int j = front;j<=mid;j++){
                        temp[i++] = array[j];
                    }
                    printAllArray(temp,-1);
                    break;
                }
                //array의 앞부분이 작은 경우 temp에 front의 값을 넣고 1 각각 1 증가
                else if(array[front] < array[back]) temp[i++] = array[front++];

                    //반대의 경우 temp에 back에 값을 넣고 각각 1증가
                else temp[i++] = array[back++];
            }
            i = 0;
            for(int index = start;index<=end;index++){
                array[index] = temp[i++];
            }
            printAllArray(array,1);
        }
    }
}
