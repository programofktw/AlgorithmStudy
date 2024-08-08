package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String NM = br.readLine();
		StringTokenizer nm = new StringTokenizer(NM);
		int N = Integer.parseInt(nm.nextToken());
		int M = Integer.parseInt(nm.nextToken());
		StringBuilder result = new StringBuilder();
		int in[] = new int[N];
		long dp[] = new long[N+1];
		
		StringTokenizer input = new StringTokenizer(br.readLine());
		int i = 0;
		dp[0] = 0;
		while(input.hasMoreTokens()) {
			dp[++i] += Long.parseLong(input.nextToken()) + dp[i-1]; 
		}
		
		
		int a,b;
		for(int j=0;j<M;j++) {
			StringTokenizer length = new StringTokenizer(br.readLine());
			a= Integer.parseInt(length.nextToken());
			b= Integer.parseInt(length.nextToken());
			long sum = 0;
			sum = dp[b] - dp[a-1];
			result.append(sum).append("\n");
		}
		
		System.out.println(result);
	}	
}
