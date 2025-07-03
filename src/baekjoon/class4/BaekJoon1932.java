package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1932 {

    static int N;
    static int[][] arr;

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        dp = new int[N][N];
        
        //트리 입력
        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int j = 0;

            while(st.hasMoreTokens()){
                arr[i][j++]=Integer.parseInt(st.nextToken());
            }
        }

        //dp로 결과 구하기


        for(int depth=dp.length-1;depth>=0;depth--){
            for(int row = 0; row<=depth;row++){
                if(depth==dp.length-1){
                    dp[depth][row] = arr[depth][row];
                }
                else{
                    dp[depth][row] = arr[depth][row] +Math.max(dp[depth+1][row],dp[depth+1][row+1]);
                }
            }
        }

        System.out.print(dp[0][0]);


    }
}
