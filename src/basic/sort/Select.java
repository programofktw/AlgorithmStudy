package basic.sort;

/*
Select 선택 정렬
- 정렬되지 않은 곳에서 가장 작은 수를 찾아 그것을 맨 앞에 배치
- O(N^2) 의 시간 복잡도를 가짐
- 데이터 크기가 크지 않을 경우 속도가 빠름.
 */
public class Select implements Sort{


    @Override
    public void sort(int[] array) {
        int minIndex;
        int minValue;

        for(int i=0;i<array.length-1;i++){
            minIndex = i;
            minValue=  array[i];
            for(int j=i+1;j<array.length;j++){
                if(array[j] < minValue){
                    minValue = array[j];
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
            printAllArray(array,i);
        }
    }
}
