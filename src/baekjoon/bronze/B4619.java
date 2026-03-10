package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B4619 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        while(true){
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(input[0] ==0 && input[1]==0) break;

            int i = 0;

            while(Math.pow(i,input[1])<input[0]){
                i++;
            }

            if(Math.pow(i,input[1])-input[0]>input[0]-Math.pow((i-1),input[1])){
                i--;
            }
            sb.append(i).append("\n");
        }



        System.out.print(sb);
    }


}
