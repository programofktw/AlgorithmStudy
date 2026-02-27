package bkd.base_code_create2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10804 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


        for(int i = 0 ; i < 10 ; i++){
            int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            rangeReverse(array,inputs[0],inputs[1]);
        }


        for(int result : array){
            if(result == 0){continue;}
            sb.append(result).append(" ");
        }

        System.out.print(sb);
    }


    private static void rangeReverse(int[] arr, int start, int end) {

        int mid = (start + end)/2;

        for(int i = start; i<=mid;i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
