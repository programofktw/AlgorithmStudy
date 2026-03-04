package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B23795 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int input;
        int result=0;

        while(true){
            input = Integer.parseInt(br.readLine());

            if(input==-1){
                break;
            }
            result += input;
        }


        sb.append(result);
        System.out.print(sb);
    }

}
