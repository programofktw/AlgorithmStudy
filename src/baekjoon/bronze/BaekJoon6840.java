package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon6840 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int mid;
		if(a>b) {
			if(c>a) mid = a;
			else {
				if(c>b) mid =c;
				else mid =b;
			}
		}
		else {
			if(c>b) mid = b;
			else {
				if(c>a) mid = c;
				else mid =a;
			}
		}
		
		System.out.print(mid);
	}
}
