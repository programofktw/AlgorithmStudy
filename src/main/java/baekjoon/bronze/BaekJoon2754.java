package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon2754 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		double result =0;
		
		result += 'E'-s.charAt(0);
		
		if(s.length()>=2) {
			if(s.charAt(1)=='+') {
				result += 0.3;
			}
			else if(s.charAt(1)=='-') {
				result -= 0.3;
			}	
		}
		
		if(s.charAt(0)=='F') {
			result++;
		}
		
		System.out.print(result);	
	}
}
