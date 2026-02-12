package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B34362 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        double  a = Double.parseDouble(br.readLine());

        double result = a- 0.3;

        sb.append(result);

        System.out.print(sb);
    }
}
