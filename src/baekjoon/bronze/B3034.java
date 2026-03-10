package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3034 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        int h = Integer.parseInt(input[2]);

        int max = w*w + h*h;

        for(int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if(max >= x*x){
                sb.append("DA").append("\n");
            }else{
                sb.append("NE").append("\n");
            }

        }

        System.out.print(sb);
    }
}
