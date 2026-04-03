package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17283 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int input = Integer.parseInt(br.readLine());

        int rate = Integer.parseInt(br.readLine());

        int result = 0;

        int col=2;

        while(input>5){
            int row = input * rate /100;

            if(row <=5) break;

            result += row * col;
            col *=2;

            input = row;
        }
        sb.append(result);
        System.out.print(sb);
    }
}
