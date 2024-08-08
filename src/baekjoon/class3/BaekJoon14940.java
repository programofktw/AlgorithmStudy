package baekjoon.class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.*;

public class BaekJoon14940 {
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
		
		int endPointY=0;
		int endPointX=0;
		
		field = new int[N][M];
		visited = new boolean[N][M];
		result = new int[N][M];
		for(int i = 0 ; i<N;i++) {
			st = new StringTokenizer(bf.readLine()," ");
			for(int j = 0 ; j<M;j++) {
				int input = Integer.valueOf(st.nextToken());
				if(input==2) {
					endPointX = j;
					endPointY = i;
				}
				field[i][j] = input;
				if(input==0) result[i][j]=0;
				else result[i][j] = -1;
			}
		}
		visited[endPointY][endPointX] = true;
		queue.add(new Point(endPointX,endPointY,0));
		while(!queue.isEmpty()) {
			Point now = queue.poll();
			bfs(now.x,now.y,now.count);
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i<N;i++) {
			for(int j = 0 ; j<M;j++) {
				sb.append(result[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	
	
	public static void bfs(int x, int y, int count) {
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

