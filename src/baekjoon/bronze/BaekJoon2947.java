package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon2947 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }

        for(int i =0;i<5;i++){
            for(int j=0;j<4;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    printArr(arr);
                }
            }
        }

    }

    static void printArr(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];

        arr[a] = arr[b];

        arr[b] = temp;
    }
}
