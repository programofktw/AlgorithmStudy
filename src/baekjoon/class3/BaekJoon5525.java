package baekjoon.class3;

import java.util.Scanner;
import java.io.*;

public class BaekJoon5525 {
	static long loop;
	static long count=0;
	static String S;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(bf.readLine());
		
		int M = Integer.valueOf(bf.readLine()); 
		
		S = bf.readLine();
	
		loop = 1+ (N*2);
		
		for(int i = 0 ;i<=M-loop;i++) {
			if(S.charAt(i)=='I') {
				if(check(i)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}
	
	public static boolean check(int x) {
		for(int i=x; i<x+loop-1;i++) {
			if(S.charAt(i)==S.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	
}
