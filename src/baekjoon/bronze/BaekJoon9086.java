package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon9086 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T =scan.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<T;i++) {
			String s = scan.next();
			sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append("\n");
		}
		System.out.println(sb);
	}
}
