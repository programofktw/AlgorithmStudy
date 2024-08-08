package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BaekJoon2667 {

	static int[][] field;
	static boolean[][] visited;
	static Queue<Point> queue = new LinkedList<>();
	static List<Integer> apart = new ArrayList<>();
	static int count;
	static int dan=0;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.valueOf(bf.readLine());
		
		field = new int[N][N];
		visited = new boolean[N][N];
		//입력부
		for(int i = 0 ; i <N;i++) {
			String s = bf.readLine();
			for(int j=0;j<N;j++) {
				field[i][j] = Integer.valueOf(s.charAt(j)+"");
			}
		}
		
		//처리부
		for(int i=0;i<N;i++) {
			for(int j = 0 ; j<N;j++) {
				if(!visited[i][j]&&field[i][j]==1) {
					dan++;
					visited[i][j] = true;
					queue.add(new Point(j,i));
					count=0;
					while(!queue.isEmpty()) {
						Point p = queue.poll();
						bfs(p.x,p.y,dan);
					}
					apart.add(count);
				}
			}
		}
		Collections.sort(apart);
		
		System.out.println(apart.size());
		for(int i= 0 ; i<apart.size();i++) {
			System.out.println(apart.get(i));
		}
		
	}
	
	public static void bfs(int x, int y, int dan) {
		count++;
		if(x-1>=0&&!visited[y][x-1]&&field[y][x-1]==1) {
			visited[y][x-1] = true;
			queue.add(new Point(x-1,y));
		}
		if(x+1<N&&!visited[y][x+1]&&field[y][x+1]==1) {
			visited[y][x+1] = true;
			queue.add(new Point(x+1,y));
		}
		if(y-1>=0&&!visited[y-1][x]&&field[y-1][x]==1) {
			visited[y-1][x] = true;
			queue.add(new Point(x,y-1));
			
		}
		if(y+1<N&&!visited[y+1][x]&&field[y+1][x]==1) {
			visited[y+1][x] = true;
			queue.add(new Point(x,y+1));
		}
	}
	
	
	static class Point{
		int x;
		int y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
}
