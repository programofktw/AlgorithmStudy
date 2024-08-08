package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon1676 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int result = 0;
		while(N>=5) {
			result += N/5;
			N/= 5;
		}
		
		System.out.print(result);		
	}
	
}
