package baekjoon.class3;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BaekJoon2630 {
	static int white=0;
	static int blue=0;
	static int[][] field;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.valueOf(bf.readLine());
		
		field = new int[N][N];
		
		for(int i =0 ;i<N;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j = 0; j<N;j++)
				field[i][j] = Integer.valueOf(st.nextToken());
		}
		int result = dc(0,N-1,0,N-1);
		
		if(result==1) blue++;
		else if(result==0) white++;
		
		System.out.println(white+"\n"+blue);
		
	}
	
	public static int dc(int x1, int x2, int y1, int y2) {
		if(x1==x2&&y1==y2) {
			if(field[x1][y1]==1) return 1;
			else return 0;
		}
		else {
			int area[] = new int[4];
			int temp = (x1+x2)/2;
			int temp2 = (y1+y2)/2;
			area[0] = dc((x1),temp,(y1),temp2);
			area[1] = dc(temp+1,(x2),(y1),temp2);
			area[2] = dc((x1),temp,temp2+1,(y2));
			area[3] = dc(temp+1,(x2),temp2+1,(y2));

			if(area[0]==1&&area[1]==1&&area[2]==1&&area[3]==1) return 1;
			
			else if(area[0]==0&&area[1]==0&&area[2]==0&&area[3]==0)	return 0;
			
			else {
				for(int i=0;i<4;i++) {
					if(area[i]==1) blue++;
					else if(area[i]==0) white++;
				}
				return 2;
			}	
			
		}
		
	}
	
}
