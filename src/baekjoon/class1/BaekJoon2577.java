package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int mul = A*B*C;
		
		String s = ""+mul;
		
		int[] result = new int[10];
		
		for(int i = 0; i<s.length();i++) {
			result[(int)(s.charAt(i))-48]++;
		}
		
		for(int i = 0 ; i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
