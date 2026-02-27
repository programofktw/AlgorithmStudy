package bkd.base_code_create2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10871 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);

        int baseLine = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");

        for(String s : input){
            int a = Integer.parseInt(s);

            if(baseLine > a) sb.append(a).append(" ");

        }

        System.out.print(sb);
    }


}
