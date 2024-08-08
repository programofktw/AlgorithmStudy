package baekjoon.class3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BaekJoon2178 {
	static int[][] field;
	static boolean[][] visited;
	static int N;
	static int M;
	static int[][] result;
	static Queue<Point> queue = new LinkedList<>(); 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());

		field = new int[N][M];
		visited = new boolean[N][M];
		result = new int[N][M];
		for(int i = 0 ; i<N;i++) {
			String[] sa = bf.readLine().split("");
			for(int j = 0 ; j<M;j++) {
				int input = Integer.valueOf(sa[j]);

				field[i][j] = input;
			}
		}
		queue.add(new Point(0,0,1));
		while(!queue.isEmpty()) {
			Point now = queue.poll();
			bfs(now.x,now.y,now.count);
		}
		
		System.out.println(result[N-1][M-1]);
		
	}
	static void bfs(int x, int y, int count) {
		result[y][x] = count;
		int next =count+1;
		if(x-1>=0&&!visited[y][x-1]&&field[y][x-1]==1) {
			visited[y][x-1] =true;
			queue.add(new Point(x-1,y,next));
		}
		if(y-1>=0&&!visited[y-1][x]&&field[y-1][x]==1) {
			visited[y-1][x] =true;
			queue.add(new Point(x,y-1,next));
		}
		if(x+1<M&&!visited[y][x+1]&&field[y][x+1]==1) {
			visited[y][x+1] =true;
			queue.add(new Point(x+1,y,next));
		}
		if(y+1<N&&!visited[y+1][x]&&field[y+1][x]==1) {
			visited[y+1][x] =true;
			queue.add(new Point(x,y+1,next));
		}
	}
	
	static class Point{
		int x,y,count;
		
		public Point(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
}
