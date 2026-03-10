package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11874 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int L = Integer.parseInt(br.readLine());

        int D = Integer.parseInt(br.readLine());

        int X = Integer.parseInt(br.readLine());

        boolean first = true;

        int max = 0;

        for (int i = L; i <=D;i++ ){
            if(X==sum(i)){
                if(first){
                    sb.append(i);
                    first = false;
                    max = i;
                }else{
                    max = i;
                }
            }
        }

        sb.append("\n").append(max);

        System.out.print(sb);
    }


    static int sum(int a){
        int result = 0;

        int na = 10000;

        while(true){
            result += a/na;
            a = a%na;
            na /= 10;
            if(a==0) return result;
        }
    }
}
