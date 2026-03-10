package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15881 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        String input = br.readLine();

        char[] pPAp = {'p','P','A','p'};

        int now = 0;

        int result =0;

        for(char cha : input.toCharArray()){
            if(cha==pPAp[now]){
                now++;
            }else{
                if(cha==pPAp[0])
                    now=1;
                else
                    now=0;
            }

            if(now==4){
                result++;
                now=0;
            }
        }

        sb.append(result);

        System.out.print(sb);
    }

}
