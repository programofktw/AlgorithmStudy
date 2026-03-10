package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10833 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());



        int result = 0;


        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            int student = Integer.parseInt(input[0]);

            int apple = Integer.parseInt(input[1]);

            result += apple % student;
        }


        sb.append(result);

        System.out.print(sb);
    }


}
