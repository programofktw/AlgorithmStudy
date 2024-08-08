package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon7891 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int T = scan.nextInt();
		
		for(int i = 0; i<T;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a+b);
		}
	}
}
