package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon10872 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		long result=1;
		
		for(int i= 1 ; i<=N;i++) {
			result *= i;
		}
		
		System.out.println(result);
	}
}
