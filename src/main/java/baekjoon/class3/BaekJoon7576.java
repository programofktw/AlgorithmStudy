package baekjoon.class3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;




public class BaekJoon7576 {
	
	static Queue<Point> queue = new LinkedList<>();
	static int[][] field;
	static boolean[][] visited;
	static int Max = 0;
	static int N;
	static int M;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine()+" ");
		
		M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		
		field = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0;i<N;i++) {
			st = new StringTokenizer(bf.readLine()+" ");
			for(int j = 0 ; j<M;j++) {
				int input = Integer.valueOf(st.nextToken());
				field[i][j] = input;
				if(input == 1)queue.add(new Point(j,i,0));
			}
		}
		
		while(!queue.isEmpty()) {
			Point now = queue.poll();
			bfs(now.x,now.y,now.count);
		}
		
		if(!checkDone()) Max = -1;
		
		System.out.print(Max);
	}
	public static void bfs(int x, int y, int count) {
		field[y][x] = 1;
		int next =count+1;
		if(count > Max) Max = count;
		if(x-1>=0&&!visited[y][x-1]&&field[y][x-1]==0) {
			visited[y][x-1] =true;
			queue.add(new Point(x-1,y,next));
		}
		if(y-1>=0&&!visited[y-1][x]&&field[y-1][x]==0) {
			visited[y-1][x] =true;
			queue.add(new Point(x,y-1,next));
		}
		if(x+1<M&&!visited[y][x+1]&&field[y][x+1]==0) {
			visited[y][x+1] =true;
			queue.add(new Point(x+1,y,next));
		}
		if(y+1<N&&!visited[y+1][x]&&field[y+1][x]==0) {
			visited[y+1][x] =true;
			queue.add(new Point(x,y+1,next));
		}
	}
	
	public static boolean checkDone(){
		
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				if(field[i][j]==0) return false;
			}
		}
		
		return true;
		
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


