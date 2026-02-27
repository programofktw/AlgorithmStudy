package bkd.base_code_create2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1267 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int Y = 0;

        int M = 0;

        for(int time : input){
            if(time == 0){
                continue;
            }

            Y += (time/30+1)*10;
            M += (time/60+1)*15;
        }

        int min = Math.min(Y,M);

        if(Y==min){
            sb.append("Y").append(" ");
        }
        if(M==min){
            sb.append("M").append(" ");
        }
        sb.append(min);

        System.out.print(sb);
    }
}
