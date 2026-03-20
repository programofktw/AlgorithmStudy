package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B31668 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        int m = Integer.parseInt(br.readLine());

        int k = Integer.parseInt(br.readLine());

        sb.append((m/n)*k);


        System.out.print(sb);
    }


}
