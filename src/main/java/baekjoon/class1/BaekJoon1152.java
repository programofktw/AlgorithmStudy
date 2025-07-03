package baekjoon.class1;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		s = s.toUpperCase();
		
		char maxNumAlpha = maxNum(s);
		System.out.println(maxNumAlpha);
	}
	
	public static char maxNum(String s) {
		char result = '?';
		int max = 0;
		int first = 0;
		int second = 0;
		int[] alph = new int[28];
		for(int i= 0 ; i < s.length();i++) {
			alph[s.charAt(i)-65]++;
		}
		
		for(int i = 1 ; i<alph.length-1;i++) {
			if(alph[i] > alph[first]) first = i;
		}
		max = alph[first];
		alph[first] = -1;
		
		for(int i = 1 ; i<alph.length-1;i++) {
			if(alph[i] > alph[second]) second = i;
		}
		if(max != alph[second]) result = (char)(first+65);
		return result;
	}
	
}
