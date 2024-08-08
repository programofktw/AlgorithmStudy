package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon1074 {
	
	static int count = 0;
	static int c;
	static int r;
	static int result;
	static int pownum;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int N2 = (int) Math.pow((double)2, (double)N);
		pownum = N2*N2;
		
		
		r = scan.nextInt();
		c = scan.nextInt();	
		dfs(0,0,N2-1,N2-1);

		System.out.println(result);
		
	}
	
	public static void dfs(int startX, int startY, int endX, int endY) {
		if(startX==endX && startY==endY) {
			result = count;
			return;
		}
		else {
			int midX = (startX+endX)/2;
			int midY = (startY+endY)/2;
			int diff = pownum/4;
			pownum/=4;
			if(c<=midX&&r<=midY) {
				dfs(startX,startY,midX,midY);
			}
			else if(c>midX&&r<=midY) {
				count += diff;
				dfs(midX+1,startY,endX,midY);
			}
			else if(c<=midX&&r>midY) {
				count += diff*2;
				dfs(startX,midY+1,midX,endY);
			}
			else if(c>midX&&r>midY) {
				count += diff*3;
				dfs(midX+1,midY+1,endX,endY);
			}
		}
	}
}
