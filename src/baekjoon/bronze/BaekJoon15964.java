package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon15964 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextInt();
		long B = scan.nextInt();
		
		System.out.println(OP(A,B));
	}
	
	public static long OP(long a, long b) {
		return (a+b)*(a-b);
	}
}
