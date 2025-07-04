package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon2869 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();
		
		int day;
		
		
		day = (V-A)/(A-B);
		if((V-A)%(A-B)!=0)day++;
		day++;
		
		System.out.println(day);
	}
}
