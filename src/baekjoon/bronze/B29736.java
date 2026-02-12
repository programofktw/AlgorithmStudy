package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B29736 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");

        int K = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        int count = 0;

        for(int i = K-X; i<=K+X;i++){
            if(i>=A&&i<=B){
                count++;
            }
        }

        if(count==0){
            sb.append("IMPOSSIBLE");
        }else{
            sb.append(count);
        }

        System.out.print(sb);

    }

}
