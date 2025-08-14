package baekjoon.class2;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon18110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double sum = 0;
		int avg;
		int[] arr = new int[N];
		
		for(int i = 0 ; i<N;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int remove = (int)Math.round(N *15.0 /100);
		
		for(int i = remove; i<N-remove;i++) {
			sum+= arr[i];
		}
		
		avg = (int)Math.round((double)sum/(N-(2*remove)));
		
		System.out.println(avg);
	}
}
