package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon3052 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int[] na = new int[42];
		int result= 0;
		for(int i = 0;i<10;i++) {
			int input = scan.nextInt();
			na[input%42]++;
		}
		for(int i =0;i<42;i++) {
			if(na[i] != 0) result++;
		}
		
		System.out.println(result);
	}
}
