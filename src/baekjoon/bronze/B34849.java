package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B34849 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        long n = Long.parseLong(br.readLine());

        long pow = n * n;

        if(pow<=100000000){
            sb.append("Accepted");
        }else{
            sb.append("Time limit exceeded");
        }


        System.out.print(sb);
    }

}
