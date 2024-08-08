package baekjoon.class3;

import java.util.Scanner;

public class BaekJoont2630Two {
	static int white=0;
	static int blue=0;
	static int[][] field;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N  = scan.nextInt();
		
		field = new int[N][N];
		
		for(int i =0 ;i<N;i++) {
			for(int j = 0 ; j<N;j++)
				field[i][j] = scan.nextInt();
		}
		dc(0,N-1,0,N-1);
		
		
		System.out.println(white+"\n"+blue);
		
	}
	
	public static void dc(int x1, int x2, int y1, int y2) {
		
		if(check(x1,x2,y1,y2)) {
			if(field[y1][x1] == 1) blue++;
			else {
				white++;
			}
		}
		else {			
			int temp = (x1+x2)/2;
			int temp2 = (y1+y2)/2;
			dc((x1),temp,(y1),temp2);
			dc(temp+1,(x2),(y1),temp2);
			dc((x1),temp,temp2+1,(y2));
			dc(temp+1,(x2),temp2+1,(y2));
		}
		
	}
	
	public static boolean check(int x1, int x2, int y1, int y2) {
		
		int first = field[y1][x1];
		
		for(int i = y1; i<=y2;i++) {
			for(int j = x1; j<= x2;j++) {
				if(first!=field[i][j]) return false;
			}
		}
		return true;	
	}
}
