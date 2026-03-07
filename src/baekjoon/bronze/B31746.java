package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B31746 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long n = Long.parseLong(br.readLine());

        if(n%2==0){
            sb.append("SciComLove");
        }else{
            sb.append("evoLmoCicS");
        }

        System.out.print(sb);
    }


}
