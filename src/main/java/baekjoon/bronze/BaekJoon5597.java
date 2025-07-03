package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon5597 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean[] submit = new boolean[30];
		
		for(int i=0;i<28;i++) {
			int n = scan.nextInt()-1;
			submit[n] = true;

		}
		
		for(int i = 0;i<30;i++) {
			if(!submit[i])
				System.out.println(i+1);
		}
	}
}
