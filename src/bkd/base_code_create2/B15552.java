package bkd.base_code_create2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B15552 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());


        int[] input;
        for(int i = 0; i < n; i++){
            input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            sb.append(input[0]+input[1]).append("\n");

        }


        System.out.print(sb);
    }


}
