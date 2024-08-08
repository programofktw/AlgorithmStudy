package baekjoon.class1;

import java.util.Arrays;
import java.util.Scanner;
//알파벳 찾기
public class BaekJoon10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] alph = new int[26];
		
		Arrays.fill(alph, -1);
		String S = scan.next();
		String result = "";
		for(int i = 0 ; i<S.length();i++) {
			if(alph[S.charAt(i) - 97] == -1) alph[S.charAt(i) - 97] = i;
		}
		
		for(int i =0;i<alph.length ; i++) {
			result += alph[i]+" ";
		}
		result = result.trim();
		
		System.out.print(result);
	}
}
