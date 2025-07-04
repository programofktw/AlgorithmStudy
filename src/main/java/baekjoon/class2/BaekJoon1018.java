package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon1018 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		String[] field = new String[N];
		int result=100;
		
		for(int i = 0 ; i<N;i++) {
			field[i] = scan.next();
		}
		System.out.println("check");
		for(int i = 0;i<=N-8;i++) {
			for(int j = 0;j<=M-8;j++) {
				result = Math.min(result, check(field,i,j));				
			}
		}
		
		System.out.println(result);
	}
	
	public static int check(String[] field, int i, int j) {
		int case1_result=0;
		int case2_result=0;
		char[] case1 = new char[2];
		char[] case2 = new char[2];

		
		case1[0] = 'W';
		case1[1] = 'B';
		
		case2[0] = 'B';
		case2[1] = 'W';
		
		for(int y = i ; y<i+8;y++) {
			for(int x = j; x<j+8;x++) {
				if(field[y].charAt(x) != case1[(y+x)%2]) case1_result++;
				if(field[y].charAt(x) != case2[(y+x)%2]) case2_result++;
			}
		}
		
		return Math.min(case1_result,case2_result);
	}
}
