package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon5522 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long score=0;
		
		for(int i = 0;i<5;i++) {
			score += scan.nextLong();
		}
		
		System.out.println(score);
		
	}
}
