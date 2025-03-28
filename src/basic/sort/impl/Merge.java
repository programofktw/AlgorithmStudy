package basic.sort.impl;

import basic.sort.Sort;

public class Merge implements Sort {
    @Override
    public void sort(int[] array) {
        merge(array,0,array.length-1);
    }


    public void merge(int[] array, int start, int end){
        int[] temp = new int[end-start];

        for(int i=start;i<end;i++){

        }
    }
}
