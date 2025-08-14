package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon1012 {
	static boolean[][] visited;
	static int[][] field;
	static int count=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0;i<T;i++) {
			count=0;
			int M = scan.nextInt();
			int N = scan.nextInt();
			int K = scan.nextInt();
			field = new int[N][M];
			visited = new boolean[N][M];
			for(int j=0;j<K;j++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				field[y][x] = 1;
			}
			
			for(int j=0;j<field.length;j++) {
				for(int h=0;h<field[1].length;h++) {
					if(field[j][h]==1&&!visited[j][h]) {
						dfs(h,j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	
	public static void dfs(int x, int y) {
		if(!visited[y][x]) {
			visited[y][x]=true;
			if(x+1<visited[1].length&&field[y][x+1]==1)
				dfs(x+1,y);
			if(x-1>=0&&field[y][x-1]==1)
				dfs(x-1,y);
			if(y+1<visited.length&&field[y+1][x]==1)
				dfs(x,y+1);
			if(y-1>=0&&field[y-1][x]==1)
				dfs(x,y-1);
		}
		
	}
	
}
