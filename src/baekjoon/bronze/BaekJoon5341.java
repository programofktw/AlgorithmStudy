package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon5341 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int n = scan.nextInt();
			if(n==0) break;
			int sum = 0;
			for(int j =1 ;j<=n;j++) {
				sum+=j;
			}	
			System.out.println(sum);
		}
	}
}
