package baekjoon.class3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon17219 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<String,String> map = new HashMap<String, String>();
		StringBuilder sb = new StringBuilder();
		
		int N = scan.nextInt();
		
		int M = scan.nextInt();
		
		for(int i = 0; i<N;i++) {
			map.put(scan.next(), scan.next());
		}
		
		for(int j= 0 ; j<M;j++) {
			sb.append(map.get(scan.next())).append("\n");
		}
		System.out.println(sb);
	}
}
