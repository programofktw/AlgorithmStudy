package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon11724 {
	static boolean[][] field;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int connect=0;
		int N  = scan.nextInt();
		int M = scan.nextInt();
		
		field = new boolean[N+1][N+1];
		visited = new boolean[N+1];
		for(int i = 0; i<M;i++) {
			int node1 = scan.nextInt();
			int node2 = scan.nextInt();
			field[node1][node2] = true;
			field[node2][node1] = true;
		}
		
		for(int i = 1;i<=N;i++) {
			if(!visited[i]) {
				dfs(i);	
				connect++;
			}
		}
		
		System.out.println(connect);
		
	}
	
	public static void dfs(int node) {
		visited[node] = true;
		
		for(int i = 0;i<field[node].length;i++) {
			if(field[node][i]&&!visited[i]) dfs(i);
		}
	}

}
