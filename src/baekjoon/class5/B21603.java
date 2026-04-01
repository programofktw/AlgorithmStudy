package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B21603 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int N = input[0];

        int K = input[1];

        int K2 = K*2;

        int fk = K%10;

        int fk2 = K2%10;

        int result = 0;
        for(int i = 1;i<=N;i++){
            if(i%10==fk||i%10==fk2){
                continue;
            }else{
                result++;
                sb.append(i).append(" ");
            }
        }


        sb.insert(0,result+"\n");



        System.out.print(sb);
    }


}
