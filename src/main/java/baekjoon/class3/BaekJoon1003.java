package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon1003 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = scan.nextInt();
		
		for(int i = 0; i<N;i++) {
			
			int input = scan.nextInt();
			int[][] arr = new int[input+1][2];
			fibo(arr);
			sb.append(arr[input][0]+" "+arr[input][1]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void fibo(int[][] n) {
		
		if(n.length == 1) n[0][0] = 1;
		else if(n.length >= 2) {
			n[0][0] = 1;
			n[1][1] = 1;
		}
		
		for(int i = 2 ; i < n.length;i++) {
			 n[i][0] = n[i-1][0]+ n[i-2][0];
			 n[i][1] = n[i-1][1] + n[i-2][1];
		}
	}
}
