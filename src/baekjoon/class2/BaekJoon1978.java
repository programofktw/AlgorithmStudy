package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon1978 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int input;
		int count=0;
		for(int i =0; i<N;i++) {
			input = scan.nextInt();
			if(prime(input)) count++;
		}
		
		System.out.println(count);
	}
	
	public static boolean prime(int N) {
		if(N==1)return false;
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (N % i == 0)
				return false;
		}
		return true;
	
	}
}
