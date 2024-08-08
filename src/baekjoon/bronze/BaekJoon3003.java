package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon3003 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] collects = {1,1,2,2,2,8};
		
		for(int collect : collects) {
			int input = scan.nextInt();
			System.out.print(collect-input+" ");
		}
	}
}
