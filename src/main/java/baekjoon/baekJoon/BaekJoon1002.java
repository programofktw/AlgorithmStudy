package baekjoon.baekJoon;

import java.util.Scanner;

public class BaekJoon1002 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int TestcaseNum = scan.nextInt();

		int x1, y1, r1, x2, y2, r2;

		for(int i = 0; i<TestcaseNum ; i++){
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			r1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			r2 = scan.nextInt();
			int a = circleR(x1,y1,r1,x2,y2,r2);
			System.out.println(a);
		}
	}

	public static int circleR(int x1, int y1, int r1, int x2, int y2, int r2){
		
	
		//두점에서 만나는 경우
		if((r2-r1)*(r2-r1) <= ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) && ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) <= (r2+r1)*(r2+r1)){
			return 2;
		}
		//외접으로 한점에서 만나는 경우
		else if( ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) == (r1+r2)*(r1+r2) ) return 1;		
		//내접으로 한점에서 만나는 경우
		else if( ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) == (r1-r2)*(r1-r2) ) return 1;
		
		//두개의 원이 같은 원인 경우-> 
		else if(x1==x2 && y1==y2 && r1 == r2) return -1;

		else return 0;
	}
}
