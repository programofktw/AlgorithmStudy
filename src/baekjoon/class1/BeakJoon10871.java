package baekjoon.class1;

import java.util.Scanner;
//작은 수 찾기
public class BeakJoon10871 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int input;
		for(int i = 0;i<N;i++) {
			input = scan.nextInt();
			if(input < X) System.out.print(input+" ");
		}
	}
}
