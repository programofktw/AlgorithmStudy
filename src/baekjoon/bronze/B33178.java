package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B33178 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException {
        int input = Integer.parseInt(br.readLine());

        sb.append(input/10);


        System.out.print(sb);
    }

}
