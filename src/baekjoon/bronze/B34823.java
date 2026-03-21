package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B34823 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int y = inputs[0];

        int c = inputs[1];

        int p = inputs[2];

        int result=0;

        while(true){
            y--;
            c-=2;
            p--;

            if(y<0||c<0||p<0) break;

            result++;
        }

        sb.append(result);

        System.out.print(sb);
    }


}
