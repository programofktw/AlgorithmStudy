package baekjoon.class4;

import java.util.Scanner;

public class BaekJoon11444 {

    static int[] dp;
    static final int mod = 1000000007;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N  =scan.nextInt();

        dp = new int[N+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = (dp[i-1] % mod+ dp[i-2] % mod)%mod;
        }

        System.out.println(dp[N]);
    }
}
