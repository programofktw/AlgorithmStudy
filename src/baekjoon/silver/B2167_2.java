package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2167_2 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int[] inputs = inputIntArray(br.readLine());

        int col = inputs[0];
        int row = inputs[1];

        int[][] array = new int[col+1][row+1];
        int[][] dp = new int[col+1][row+1];

        //입력
        for(int i= 1;i<=col;i++){
            inputs = inputIntArray(br.readLine());
            for(int j = 1 ; j<=row;j++){
                array[i][j] = inputs[j-1];
            }
        }

        //누적합 구하기
        for(int i = 1; i<=col;i++){
            for(int j = 1 ; j<=row;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + array[i][j];
            }
        }

        int testCase = Integer.parseInt(br.readLine());

        while(testCase-->0){
            inputs = inputIntArray(br.readLine());

            long result = 0;
            int N = inputs[0];
            int M = inputs[1];

            int X = inputs[2];
            int Y = inputs[3];

            result = dp[X][Y] - dp[N-1][Y] - dp[X][M-1] + dp[N-1][M-1];

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }

    static int[] inputIntArray(String input) throws IOException {
        return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }


}
