package baekjoon.class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon1260 {
	
	static boolean[][] edge;
	static boolean[] visited;
	
	public static Stack<Integer> stack = new Stack<>();
	public static Queue<Integer> queue = new LinkedList<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int V = scan.nextInt();
		edge = new boolean[N+1][N+1];
		visited = new boolean[N+1];
		for(int i = 0;i<M;i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			
			edge[v1][v2]=true;
			edge[v2][v1]= true;
		}
		visited[V] = true;
		stack.push(V);
		dfs();
		System.out.println("");
		visited = new boolean[N+1];
		visited[V] = true;
		queue.offer(V);
		bfs();
	}
	
	public static void dfs() {
		int v = stack.pop();
		System.out.print(v+" ");
		for(int i = 1; i<edge[v].length;i++) {
			if(edge[v][i]) {
				if(!visited[i]) {
					visited[i]=true;
					stack.push(i);
					dfs();
				}
			}
		}
	}

	public static void bfs() {
		int v = queue.poll();
		System.out.print(v+" ");
		for(int i = 1; i<edge[v].length;i++) {
			if(edge[v][i]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.offer(i);
				}
			}
		}
		if(!queue.isEmpty())
			bfs();
	}
}
