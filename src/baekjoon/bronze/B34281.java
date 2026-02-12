package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B34281 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int w = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());

        sb.append(w*h);

        System.out.print(sb);
    }

}
