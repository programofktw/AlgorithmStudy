package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int sum;
		int plus=0;
		for(int i= 0;i<T;i++) {
			String OX = scan.next();
			sum = 0;
			plus=0;
			for(int j = 0 ; j < OX.length();j++) {
				if(OX.charAt(j)=='O') plus++;
				else plus = 0;
				sum+= plus;
			}
			
			System.out.println(sum);
		}
	}
}
