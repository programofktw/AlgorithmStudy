package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon17626 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long[] dp = new long[N+1];
		
		dp[0] = 0;
		dp[1] = 1;
		int max = 1;
		for(int i = 2; i<=N;i++) {
			long min= 100000;
			if((max+1)*(max+1)<=i) max+=1;
			for(int j = 1;j<=max;j++) {
				min = Math.min(min, (dp[i-(j*j)]+1));
			}
			dp[i]=min;
		}
		
		System.out.println(dp[N]);
	}

}
