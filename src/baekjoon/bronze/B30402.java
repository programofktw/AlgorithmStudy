package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B30402 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        while(true){
            String input = br.readLine();

            if(input.contains("w")){
                sb.append("chunbae");
                break;
            }else if(input.contains("g")){
                sb.append("yeongcheol");
                break;
            }else if(input.contains("b")){
                sb.append("nabi");
                break;
            }
        }

        System.out.print(sb);
    }
}
