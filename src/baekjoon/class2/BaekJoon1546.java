package baekjoon.class2;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] array = new int[N];
		
		double result=0;
		
		for(int i =0;i<N;i++) {
			array[i] = scan.nextInt();
		}
		
		Arrays.sort(array);
		
		
		for(int i = 0; i<N;i++) {
			result += (double)(array[i]/array[N-1])*100;
		}
		
		System.out.println(result/N);
	}
}
