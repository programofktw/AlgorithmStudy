package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon2775 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int k;
		int n;
		int[][] apatment;
		for(int a = 0 ; a<T;a++) {
			k = scan.nextInt();
			n = scan.nextInt();
			apatment = new int[k+1][n+1];
			
			for(int i = 1 ;i<apatment[0].length;i++) {
				apatment[0][i] = i;
			}
			
			for(int i = 1;i<=k;i++) {
				for(int j = 1;j<=n;j++) {
					for(int h=0;h<=j;h++) {
						apatment[i][j]+= apatment[i-1][h];
					}
				}
			}
			
			System.out.println(apatment[k][n]);	
		}		
	}
}
