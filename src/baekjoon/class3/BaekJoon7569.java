package baekjoon.class3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon7569 {
	static Queue<Point> queue = new LinkedList<Point>();
	static boolean[][][] visited;
	static int[][][] box;
	static int X;
	static int Y;
	static int Z;
	static int max=0;
	static int[][] dir = {{-1,0,0},{0,-1,0},{0,0,-1},{1,0,0},{0,0,1},{0,1,0}};
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		Z = Integer.parseInt(st.nextToken());
		box = new int[Z][Y][X];
		visited = new boolean[Z][Y][X];
		initBox(bf);
		
		doneTomato();
		
	
		if(checkBox())
			System.out.println(max);
		else {
			System.out.println(-1);
		}
		
	}
	
	public static boolean checkBox() {
		for(int z = 0 ; z<Z;z++) {
			for(int y = 0; y<Y;y++) {
				for(int x=0;x<X;x++ ) {
					if(box[z][y][x]==0) return false;
				}
			}
		}
		return true;
	}
	
	public static void doneTomato() {
		for(int z = 0 ; z<Z;z++) {
			for(int y = 0; y<Y;y++) {
				for(int x=0;x<X;x++ ) {
					if(box[z][y][x]==1&&!visited[z][y][x]) {
						visited[z][y][x]=true;
						  
						Point p = new Point(x,y,z,0);
					
						queue.add(p);

					}
				}
			}
		}
		
		
		
		while(!queue.isEmpty()) {

			Point p = queue.poll();

		
			int nowC = p.count;
			max = (max<nowC)?nowC:max;
			
			for(int i = 0 ; i<dir.length;i++) {
				int nextx = p.x+dir[i][0];
				int nexty = p.y+dir[i][1];
				int nextz = p.z+dir[i][2];
				if(checkCondition(nextx, nexty, nextz)){
				
					visited[nextz][nexty][nextx] = true;
					box[nextz][nexty][nextx] = p.count+1;
					queue.add(new Point(nextx,nexty,nextz, p.count+1));
				}
			}
		}
	}
	
	public static boolean checkCondition(int x, int y, int z) {
		if(x<0||y<0||z<0) return false;
		else if(x>=X||y>=Y||z>=Z) return false;
		else if(visited[z][y][x]) return false;
		if(box[z][y][x]==0) return true;
		return false;
	}
	
	public static void initBox(BufferedReader bf) throws IOException{
		for(int z = 0 ; z<Z;z++ ) {
			for(int y = 0; y<Y;y++) {
				StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
				for(int x= 0; x<X;x++) {
					box[z][y][x] = Integer.parseInt(st.nextToken());
				}
			}
		}
	}
	
	public static void printBox() {
		StringBuilder sb = new StringBuilder();
		for(int z = 0 ; z<Z;z++ ) {
			for(int y = 0; y<Y;y++) {
				
				for(int x= 0; x<X;x++) {
					sb.append(box[z][y][x]).append(" ");
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static void bfs(Point p) {
		
	}
	
	public static void enqueue(int x,int y, int z,int count) {
		visited[z][y][x] = true;
		
		queue.add(new Point(x,y,z,count+1));
	}
	
	static class Point{
		int x,y,z,count;
		
		public Point(int x, int y, int z, int count){
			this.x = x;
			this.y = y;
			this.z = z;
			this.count =count;
		}
	}
}
