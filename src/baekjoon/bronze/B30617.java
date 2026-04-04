package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B30617 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine());

        int[] input;

        int preL=0;
        int preR=0;

        int result =0;

        while(t-->0){
            input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int L = input[0];
            int R = input[1];
            if(preR!=0&&R==preR){
                result++;
            }
            if(preL!=0&&L==preL){
                result++;
            }
            if(L!=0&&L==R){
                result++;
            }
            preL =L ;
            preR = R;
        }

        sb.append(result);

        System.out.print(sb);
    }

}
