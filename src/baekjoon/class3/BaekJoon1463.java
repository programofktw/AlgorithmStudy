package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon1463 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int A, B, C;
		int[] arr = new int[N+1];
		
		arr[1] = 0;
		arr[0] = 100000;
		for(int i = 2; i<N+1;i++) {
			A = B = C = 10000;
			if(i%3==0) A = arr[i/3];
			if(i%2==0) B = arr[i/2];
			C = arr[i-1];
			
			arr[i] = Math.min(A,Math.min(B, C))+1;
		}
		
		System.out.println(arr[N]);
	}
}
