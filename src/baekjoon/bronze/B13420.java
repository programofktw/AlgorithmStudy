package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13420 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            long a = Long.parseLong(input[0]);

            char op = input[1].charAt(0);

            long b = Long.parseLong(input[2]);

            char equal = input[3].charAt(0);

            long result = Long.parseLong(input[4]);

            long exp = 0;

            switch(op){
                case '+':
                    exp = a+b;
                    break;
                case '-' :
                    exp = a-b;
                    break;
                case '*':
                    exp = a*b;
                    break;
                case '/':
                    exp = a/b;
                    break;
            }

            if(result == exp){
                sb.append("correct\n");
            }else{
                sb.append("wrong answer\n");
            }


        }

        System.out.print(sb);
    }
}
