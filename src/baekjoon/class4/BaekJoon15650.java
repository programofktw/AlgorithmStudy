package baekjoon.class4;

import java.util.Scanner;

public class BaekJoon15650 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0 ; i <N;i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0 ; i< N-M+1 ; i++) {
			System.out.print(arr[i]);
			for(int j=1;j<M;j++) {
				System.out.print(" "+arr[i+j]);
			}
			System.out.println();
		}
		
	}

}
