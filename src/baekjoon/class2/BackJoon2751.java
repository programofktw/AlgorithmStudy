package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BackJoon2751 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		boolean[] arr = new boolean[2000001];
		
		int input;
		
		for(int i = 0; i<N;i++) {
			input = scan.nextInt();
			arr[input+1000000] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]) sb.append(i-1000000).append("\n");
		}
		
		System.out.print(sb);
		
	}
}
