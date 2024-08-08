package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon11022 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=1;i<=T;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.printf("Case #x: %d + %d = %d\n",a,b,a+b);
		}
	}

}
