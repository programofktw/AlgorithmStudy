package baekjoon.class2;

import java.util.Scanner;

public class BackJoon11050 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N  = scan.nextInt();
		
		int K  = scan.nextInt();
		int result = 1;
		for(int i = N; i>N-K;i--) {
			result *=i;
		}
		
		for(int i = K;i>0;i--) {
			result /=i;
		}
		
		System.out.println(result);
	}
}
