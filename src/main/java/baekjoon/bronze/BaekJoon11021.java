package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon11021 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		
		int T = scan.nextInt();
		
		for(int i =0 ; i<T;i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			
			System.out.println("Case #"+(i+1)+": "+(a+b));
		}
	}
}
