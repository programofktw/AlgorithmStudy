package baekjoon.class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon21736 {
	
	static Queue<Point> queue = new LinkedList<>();
	
	static char[][] field;
	static boolean[][] visited;
	static int count=0;
	
	static int Y;
	static int X;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Y =scan.nextInt();
		X = scan.nextInt();
		
		field = new char[Y][X];
		visited = new boolean[Y][X];
		
		for(int i = 0 ; i<Y;i++) {
			String a = scan.next();
			for(int j = 0; j<X;j++) {
				char input =a.charAt(j);
				
				field[i][j] = input;
				
				if(input == 'I') {
					visited[i][j] = true;
					queue.add(new Point(j,i));
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Point p = queue.poll();
			bfs(p.x,p.y);
		}
		
		System.out.println(count);
		
	}
	
	static void bfs(int x, int y) {
		if(field[y][x] == 'P') count++;
		
		if(x-1>=0&&field[y][x-1]!='X'&&!visited[y][x-1]) {
			visited[y][x-1] = true;
			queue.add(new Point(x-1,y));
		}
		if(x+1<X&&field[y][x+1]!='X'&&!visited[y][x+1]) {
			visited[y][x+1] = true;
			queue.add(new Point(x+1,y));
		}
		if(y-1>=0&&field[y-1][x]!='X'&&!visited[y-1][x]) {
			visited[y-1][x] = true;
			queue.add(new Point(x,y-1));
		}
		if(y+1<Y&&field[y+1][x]!='X'&&!visited[y+1][x]) {
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
