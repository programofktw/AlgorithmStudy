package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon15552 {
	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		int T = Integer.valueOf(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<T;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			sb.append(Integer.valueOf(st.nextToken())+ Integer.valueOf(st.nextToken())).append("\n");
		}
		
		System.out.println(sb);
	
	}
}
