package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25372 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int testCase = Integer.parseInt(br.readLine());

        for(int i=0;i<testCase;i++){
            String input = br.readLine();

            int leng = input.length();

            if(leng>=6&&leng<=9){
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }
        }

        System.out.print(sb);
    }


}
