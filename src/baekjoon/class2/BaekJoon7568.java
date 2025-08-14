package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon7568 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] x = new int[N];
		
		int[] y = new int[N];
		
		int[] grade = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			grade[i]= 1;
		}
		
		for(int i = 0; i <N; i++) {
			for(int j = 0 ; j< N ; j++) {
				if(x[i]< x[j] && y[i]<y[j]) grade[i]++;
			}
		}
		
		for(int i = 0; i<N;i++) {
			System.out.print(grade[i]+ " ");
		}
	}
}
