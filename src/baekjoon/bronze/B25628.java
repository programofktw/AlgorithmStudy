package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25628 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");

        int bang = Integer.parseInt(input[0]);

        int pat = Integer.parseInt(input[1]);

        int max = Math.min(bang/2,pat);

        sb.append(max);
        System.out.print(sb);
    }

}
