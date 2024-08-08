package baekjoon.class2;

import java.util.Scanner;

public class BeakJoon2292 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Long N = scan.nextLong();
		int i = 1;
		int result;
		N-=1;
		while(N>0) {
			N -= (i++)*6;
		}
		
		
		System.out.println(i);
		
	}
}
