package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B6190 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        long n = Long.parseLong(br.readLine());

        int result = 0;

        while(n!=1){
            if(n%2==0){
                n/=2;
            }else{
                n= 3*n+1;
            }
            result++;
        }

        sb.append(result);

        System.out.print(sb);
    }


}
