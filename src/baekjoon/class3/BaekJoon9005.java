package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon9005 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 0; i<T;i++) {
			int N = scan.nextInt();
			int[] dp = new int[N+1];
			dp[0]=  1;
			dp[1] = 1;
			if(dp.length>=3) dp[2]=2; // 2 , 1+1
			if(dp.length>=4) dp[3]=4; // 3 , 2+1, 1+2, 1+1+1
			
			for(int j = 4; j<dp.length;j++) {
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
			
			System.out.println(dp[N]);
			
		}
	}
}
