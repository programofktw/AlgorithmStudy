package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        for(int i = 1 ;i<=n;i++){
            sb.append(String.format("Hello World, Judge %d!",i)).append("\n");
        }

        System.out.print(sb);
    }

}
