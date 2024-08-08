package baekjoon.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1181 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		

		String line;
		
		for(int i = 0;i<N;i++) {
			line = br.readLine();
			arr[i] = line;
		}
		
		sort(arr);
		
		String temp="";
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i<arr.length;i++) {
			if(temp.equals(arr[i])) continue;
			sb.append(arr[i]).append("\n");
			temp = arr[i];		
		}
		
		System.out.println(sb);
		
	}
	
	public static void sort(String[] arr) {
		String temp;
		String tempArr[] = new String[2];
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].length() > arr[j+1].length()) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				else if(arr[j].length()==arr[j+1].length()) {
					tempArr[0] = arr[j];
					tempArr[1] = arr[j+1];
					
					Arrays.sort(tempArr);
					
					arr[j] = tempArr[0];
					arr[j+1] = tempArr[1];
				}
			}
		}
	}
}
