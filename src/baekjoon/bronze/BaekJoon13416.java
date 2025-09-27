package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon13416 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for(int i =0;i<testCase;i++){
            int dayNum = Integer.parseInt(br.readLine());
            int result = 0;
            for(int j=0;j<dayNum;j++){
                //특정 날의 주식
                StringTokenizer st = new StringTokenizer(br.readLine());

                int max;
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int C = Integer.parseInt(st.nextToken());

                max = Math.max(A,Math.max(B, C));

                if(max>=0)
                    result += max;

            }

            sb.append(result).append("\n");
        }
        System.out.print(sb);

    }
}
