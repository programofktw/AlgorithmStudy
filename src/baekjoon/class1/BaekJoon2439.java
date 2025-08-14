package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon2439 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int end = scan.nextInt();
		
		for(int i =end; i>0; i--) {
			for(int j = 1 ; j <= end ; j++) {
				if(i<=j) System.out.print('*');
				else System.out.print(' ');
			}
			System.out.println();
		}
	}
}
