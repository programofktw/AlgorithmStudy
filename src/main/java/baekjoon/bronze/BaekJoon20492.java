package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon20492 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		
		int a = N*78/100;
		
		int b = N - (N*20/100)*22/100;
		System.out.println(a+" "+b);
	}
}
