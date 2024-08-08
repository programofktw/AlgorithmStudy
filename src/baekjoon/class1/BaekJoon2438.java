package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon2438 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int end = scan.nextInt();
		
		for(int i =0; i<end; i++) {
			for(int j = 0 ; j <i+1 ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
