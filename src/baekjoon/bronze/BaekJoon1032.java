package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon1032 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		String[] array = new String[N];
		for(int i= 0 ; i<N;i++) {
			array[i] = scan.next();
		}

		boolean[] result = new boolean[array[0].length()];
		for(int i = 0 ; i<array[0].length();i++) {
			char temp = array[0].charAt(i);
			boolean tempb = true;
			for(int j =1;j<N;j++) {
				if(array[j].charAt(i)!= temp) tempb=false;
			}
			result[i] = tempb;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0  ; i<array[0].length();i++) {
			if(result[i]) sb.append(array[0].charAt(i));
			else sb.append('?');
		}
		
		System.out.println(sb);
	}
}
