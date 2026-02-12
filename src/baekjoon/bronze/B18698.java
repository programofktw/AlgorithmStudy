package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B18698 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int testCase = Integer.parseInt(br.readLine());

        A:for(int i = 0; i< testCase;i++){
            int result = 0;

            char[] array = br.readLine().toCharArray();

            for(char now : array){
                if(now=='U') result++;
                else{
                    sb.append(result).append("\n");
                    continue A;
                }
            }

            sb.append(result).append("\n");
        }

        System.out.print(sb);

    }

}
