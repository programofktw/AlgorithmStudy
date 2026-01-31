package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B1037 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        String[] inputs = br.readLine().split(" ");


        long min = Long.MAX_VALUE;

        long max = Long.MIN_VALUE;

        for(String input : inputs){
            long now = Long.parseLong(input);

            if(min>now) min = now;
            if(max<now) max = now;

        }


        if(N==1){
            sb.append((long)Math.pow(min,2));
        }else{
            sb.append(min * max);
        }

        System.out.print(sb);

    }

}
