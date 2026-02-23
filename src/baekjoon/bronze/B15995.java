package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15995 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);


        int i = 1;
        while(true){
            if( (a * i)%m == 1){
                sb.append(i).append("\n");
                break;
            }
            i++;
        }

        System.out.print(sb);
    }


}
