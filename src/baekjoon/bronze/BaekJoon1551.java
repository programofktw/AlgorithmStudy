package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1551 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N  = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(),",");


        int i = 0;
        while(st.hasMoreTokens()){
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        for(i =0;i<K;i++){
            arr = modify(arr);
        }

        StringBuilder sb = new StringBuilder();

        for(i = 0;i<arr.length;i++){
            int num = arr[i];

            sb.append(num);
            if(i!=arr.length-1)
                sb.append(",");
        }

        System.out.print(sb);

    }

    private static int[] modify(int[] arr){

        int[] temp = new int[arr.length-1];

        for(int i = 0;i<temp.length;i++){
            temp[i]=arr[i+1] - arr[i];
        }

        return temp;
    }
}
