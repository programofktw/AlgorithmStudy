package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon15829 {
	public static void main(String[] args) {
		int M = 1234567891;

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		String input="";
		
		input = scan.next();
	
				
		long sum=0; 
		long pow=1;
		
		for(int i = 0 ; i<input.length();i++){
			sum += (input.charAt(i)-'a'+1)*pow %M;
			pow = pow *31 %M;
		}
		long hash = sum % M;
		
		System.out.print(hash);
		
		
	}
}
