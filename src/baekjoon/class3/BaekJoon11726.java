package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon11726 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long dp[]=new long[n+1];
		dp[0]=1;
		if(n>=1)
			dp[1]=1;
		for(int i = 2 ;i<=n;i++) {
			dp[i] = (dp[i-1]+dp[i-2]) % 10007;
		}
		System.out.println(dp[n]);
	}
}
