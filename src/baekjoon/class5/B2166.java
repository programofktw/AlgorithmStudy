package baekjoon.class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2166 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine())+1;

        long[] px = new long[n];

        long[] py = new long[n];

        int[] inputs;

        //입력
        for(int i= 0 ;i<n-1;i++){
            inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            px[i] = inputs[0];

            py[i] = inputs[1];
        }

        px[n-1] = px[0];

        py[n-1] = py[0];

        long result=0;

        for(int i=0;i<n;i++){
            int now = i;

            int next = (i+1)%n;


            result += (px[now] * py[next]) - (py[now] * px[next]);

        }

        result = Math.abs(result);

        sb.append(String.format("%.1f",result/2.0));

        System.out.print(sb);
    }

}
