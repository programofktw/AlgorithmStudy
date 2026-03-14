package basic.sort.impl;

import basic.sort.Sort;

public class BubbleSortAgain implements Sort {

    @Override
    public void sort(int[] array) {
        int num=1;

        for(int i = 0; i<array.length;i++){
            for(int j = 0; j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);

                }

            }

            printAllArray(array,num++);
        }



    }
}
