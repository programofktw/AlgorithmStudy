package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon2675 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 0; i<T;i++) {
			int R = scan.nextInt();
			String s = scan.next();
			
			for(int j=0;j<s.length();j++) {
				for(int z=0;z<R;z++) {
					System.out.print(s.charAt(j));
				}
			}
		}
	}
}
