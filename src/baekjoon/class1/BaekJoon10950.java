package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon10950 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int A, B;
		for(int i=0 ; i<T; i++) {
			A = scan.nextInt();
			B = scan.nextInt();
			System.out.println(A+B);
		}
	}
}
