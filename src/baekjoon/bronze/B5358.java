package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5358 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int iegap = 'i'-'e';

        while(true){
            String input = br.readLine();

            if(input==null){
                break;
            }

            for(char now : input.toCharArray()){
                if(now == 'i' || now == 'I'){
                    sb.append((char)(now-iegap));
                }else if(now=='e'||now=='E'){
                    sb.append(((char)(now+iegap)));
                }else{
                    sb.append(now);
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

}
