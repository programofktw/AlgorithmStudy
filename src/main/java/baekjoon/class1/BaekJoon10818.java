package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int first = scan.nextInt();
		int min = first;
		int max = first;
		int input;
		for(int i = 1 ; i< N;i++) {
			input = scan.nextInt();
			if(input < min) min = input;
			if(input > max) max = input;
		}
		
		System.out.print(min + " " + max);
	}
}
