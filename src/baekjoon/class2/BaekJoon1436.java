package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon1436 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int count=0;
		
		int i = 666;
		
		String title = "";
		while(true) {
			if((title = ""+i).contains("666")) count++;
			if(count == N) break;
			i++;
		}
		
		System.out.println(i);
	}
}
