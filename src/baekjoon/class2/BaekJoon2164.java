package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon2164 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int sqr2 = 1;
		
		while(sqr2 < N) {
			sqr2*=2;
		}
		sqr2/=2;
		
		
		int result =0;
		
		result = (N-sqr2)*2;
		
		if(N == 1) System.out.println("1");
		else {
			System.out.println(result);
		}
	}
	

}
