package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B16503 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args)throws IOException {

        String[] input = br.readLine().split(" ");

        int a =  Integer.parseInt(input[0]);

        int b = Integer.parseInt(input[2]);

        int c = Integer.parseInt(input[4]);


        int result1 = apply(input[3],apply(input[1],a,b),c);

        int result2 = apply(input[1],a,apply(input[3],b,c));

        sb.append(Math.min(result1,result2)).append("\n");

        sb.append(Math.max(result2,result1));

        System.out.print(sb);
    }


    static int apply(String op, int v1, int v2){


        switch (op) {
            case "+" :
                return v1 + v2;
            case "-" :
                return v1 - v2;
            case "*" :
                return v1 * v2;
            case "/" :
                return v1 / v2;
            default :
                return 0;
        }

    }
}
