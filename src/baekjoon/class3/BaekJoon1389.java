package baekjoon.class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1389 {
	
	static Queue<Node> queue = new LinkedList<>();
	static int[][] edges;
	static boolean[] visited;
	static int[] scores;
	static int count;
	static int nodeNum;
	static int edgeNum; 
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		nodeNum = scan.nextInt();
		edgeNum = scan.nextInt();
		
		edges = new int[nodeNum][nodeNum];
		scores = new int[nodeNum];
		for(int i = 0 ; i<edgeNum;i++) {
			int node1 = scan.nextInt();
			int node2 = scan.nextInt();
			edges[node1-1][node2-1] = 1;
			edges[node2-1][node1-1] = 1;
		}
		
		for(int i = 0 ; i<nodeNum;i++) {
			count = 0;
			queue.add(new Node(i,0));
			visited = new boolean[nodeNum];
			visited[i] = true;
			while(!queue.isEmpty()) {
				Node now = queue.poll();
				bfs(now.x,now.count);
				count +=now.count;
			}
			scores[i] = count;
		}
		
		int min = 100000;
		int minH = 0;
		for(int i = 0; i<nodeNum;i++) {
			if(min>scores[i]) {
				min = scores[i];
				minH = i;
			}
		}
		System.out.println(minH+1);
	}
	
	static void bfs(int node,int count) {
		int next = count+1;
		for(int i = 0; i<nodeNum;i++) {
			if(!visited[i]&&edges[i][node]==1) {
				visited[i] = true;
				queue.add(new Node(i,next));
			}
		}
		
	}

	
	static class Node{
		int x;
		int count;
		
		Node(int x, int count){
			this.x = x;
			this.count = count;
		}
	}
	
	
}
