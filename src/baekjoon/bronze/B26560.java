package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B26560 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String s = br.readLine();

            if(s.charAt(s.length()-1) =='.'){
                System.out.println(s);
            }else{
                System.out.println(s+".");
            }
        }
    }

}
