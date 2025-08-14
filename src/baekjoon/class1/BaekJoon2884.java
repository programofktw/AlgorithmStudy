package baekjoon.class1;

import java.util.Scanner;

//알람시계 45분 일찍 맞추는 프로그램
public class BaekJoon2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M-45 < 0) H = (H-1+24)%24;
		
		M = (M-45+60)%60;
		
		System.out.println(H+"\n"+M);
	}
}
