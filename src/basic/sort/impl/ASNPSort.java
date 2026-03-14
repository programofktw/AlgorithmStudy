package basic.sort.impl;

import basic.sort.Sort;

public class ASNPSort implements Sort {

    @Override
    public void sort(int[] array) {

        for(int i = 0 ; i < array.length;i++){
            for(int j = i;j<array.length;j++){
                if(array[i]>array[j]){
                    swap(array,i,j);
                }
            }
            printAllArray(array,i+1);
        }



    }
}
