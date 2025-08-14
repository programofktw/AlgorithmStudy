package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon1259 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n;
		boolean result;
		while(true) {
			n= scan.next();
			if(n.equals("0")) break;
			result = true;
			for(int i = 0; i<=(n.length()-1)/2;i++) {
				if(n.charAt(i) != n.charAt(n.length()-1-i)) result = false;
			}
			if(result) System.out.println("yes");
			else System.out.println("no");
		}
		
		
		
	}
}
