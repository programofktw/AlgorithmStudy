package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon2609 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int GCD = 1, LCM=1;
		
		int less = Math.min(A, B);
		int more = Math.max(A, B);
		for(int i = 2 ; i<=less;i++) {
			if(A%i==0 && B%i==0) GCD = i;
		}
		System.out.println(GCD);
		LCM = (A/GCD * B/GCD) * GCD;
		System.out.print(LCM);
		
	}
}
