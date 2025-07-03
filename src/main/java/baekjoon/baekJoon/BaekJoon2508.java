package baekjoon.baekJoon;

import java.util.Scanner;

public class BaekJoon2508 {
	static int N;
	static int M;
	static char[][] input;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T =scan.nextInt();
		
		for(int i = 0 ; i<T;i++) {
			N = scan.nextInt();
			M = scan.nextInt();
			input = new char[N][M];
			int count = 0;
			for(int j = 0 ; j<N;j++) {
				String oneLine = scan.next();
				for(int h =0 ;h<M;h++) {
					input[j][h]=oneLine.charAt(h);
				}
			}
			
			for(int j =0; j<N;j++) {
				for(int h = 0; h<M;h++) {
					if(input[j][h] == 'o') {
						if(check(j,h)) {
							count++;
						}
					}
				}
			}
			
			System.out.println(count);
		}
		
	}
	
	public static boolean check(int y, int x) {
		if(!(x-1<0||x+1==M)) {
			if((input[y][x-1]=='>'&&input[y][x+1]=='<')) {
				return true;
			}
		}
		if(!(y-1<0||y+1==N)) {
			if(input[y-1][x]=='v'&&input[y+1][x]=='^') {
				return true;
			}
		}
		
		
		return false;
	}
}
