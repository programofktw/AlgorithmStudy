package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon2231 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();

		int result = subs(N);
		
		System.out.println(result);
	}
	
	public static int subs(int N) {
		int result =0;
		int s=1;
		while(N%(s*10)!=N) {
			s*=10;
		}
		
		int temp=0;
		int temp2=0;
		for(int i = N-(s*9); i<=N;i++) {
			temp = i;
			temp2 = i;
			for(int j = s; j>=1;j/=10) {
				temp2 += temp / j;
				temp = temp%j;
			}
			if(temp2==N) {
				result = i;
				return result;
			}
		}
		return result;
	}
}
