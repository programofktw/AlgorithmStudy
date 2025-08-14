package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon11720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		String input = scan.next();
		int sum =0;
		for(int i = 0 ; i< N ;i++) {
			sum+= (int)input.charAt(i)-'0';
		}
		
		System.out.print(sum);
	}
}
