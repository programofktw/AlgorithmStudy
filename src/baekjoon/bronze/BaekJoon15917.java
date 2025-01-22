package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon15917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Q = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<Q;i++){
            long a = Long.parseLong(br.readLine());

            if((a&(a*-1))==a){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}
