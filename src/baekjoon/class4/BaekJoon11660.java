package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11660 {

    static int[][] dp;

    static int[][] field;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());



        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        field = new int[N][N];
        dp = new int[N][N];
        for(int i = 0 ; i<N;i++){
            int j = 0;
            st = new StringTokenizer(br.readLine());
            int sum =0;
            while(st.hasMoreTokens()){
                field[i][j] = Integer.parseInt(st.nextToken());
                sum +=field[i][j];

                dp[i][j++] = sum;
            }
        }

        for(int i = 0; i<M;i++){
            StringTokenizer testCase = new StringTokenizer(br.readLine());

            int result = 0;
            int startX = Integer.parseInt(testCase.nextToken())-1;

            int startY = Integer.parseInt(testCase.nextToken())-1;

            int endX = Integer.parseInt(testCase.nextToken())-1;

            int endY = Integer.parseInt(testCase.nextToken())-1;

            for(int y = startY; y<=endY;y++){
                if(startX-1<0){
                    result += dp[y][endX];
                }else{
                    result += dp[y][endX] - dp[y][startX-1];
                }
            }
            System.out.println(result);

        }


    }
}
