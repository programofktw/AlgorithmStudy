package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon2744 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		int diff = 'a'-'A';
		
		for(int i = 0 ; i<s.length();i++) {
			char temp = s.charAt(i);
			
			if('a'<=temp&&temp<='z') {
				System.out.print((char)(temp-diff));
			}
			else {
				System.out.print((char)(temp+diff));
			}
		}
		
	}

}
