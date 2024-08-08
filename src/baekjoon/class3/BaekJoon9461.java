package baekjoon.class3;
import java.util.Scanner;
public class BaekJoon9461 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		StringBuilder result = new StringBuilder();
		for(int i = 0 ; i<T;i++) {
			int N = scan.nextInt();
			long DP[] = new long[N+1];
			DP[0] = 0;
			DP[1] = 1;
			if(N==1) {
				result.append(DP[N]).append("\n");
				continue;
			}
			DP[2] = 1;
			if(N==2) {
				result.append(DP[N]).append("\n");
				continue;
			}
			for(int j = 3; j<=N;j++) {
				DP[j] = DP[j-2]+DP[j-3];
			}
			result.append(DP[N]).append("\n");
		}	
		System.out.println(result);
	}	
}
