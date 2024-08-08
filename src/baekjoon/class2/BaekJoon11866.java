package baekjoon.class2;

import java.util.Scanner;
public class BaekJoon11866 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int K = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		boolean[] arr = new boolean[N];
		
		int t = 0;
		int count;
		for(int i = 0 ; i<N;i++) {
			
			if(i!=0) sb.append(", ");

			count = 0;
			while(true) {
				if(!arr[t])	count++;
				if(count == K) break;
				t = (t+1)%N;
				
			}
			arr[t] = true;
			System.out.println(t+1+"제외");
			sb.append(t+1);
			
		}
		
		sb.append(">");
		System.out.println(sb);
	}
}
