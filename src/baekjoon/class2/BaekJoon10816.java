package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon10816 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[20000001];
		
		int N = scan.nextInt();
		
		for(int i = 0; i<N;i++) {
			arr[scan.nextInt()+10000000]++;
		}
		
		int M = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<M;i++) {
			sb.append(arr[scan.nextInt()+10000000]).append(" ");
		}
		
		System.out.println(sb);
	}

}
