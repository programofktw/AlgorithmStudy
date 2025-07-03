package baekjoon.class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon11651 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		Point[] p = new Point[N];
	
		for(int i = 0; i < p.length;i++) {
			p[i] = new Point(scan.nextInt(), scan.nextInt());
		}
		
		Arrays.sort(p, new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				// TODO Auto-generated method stub
				if(o1.y != o2.y) {
					return o1.y - o2.y;
				}
				else {
					return o1.x - o2.x;
				}
			}
			
		});
		
		for(int i = 0 ;i<p.length;i++) {
			System.out.println(p[i]);
		}
	
	}
}

class Point2{
	int x, y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return x + " " + y;
	}
}
