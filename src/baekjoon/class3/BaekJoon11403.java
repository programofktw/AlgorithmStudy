package baekjoon.class3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BaekJoon11403 {
	static Queue<Integer> queue = new LinkedList<>();
	static int field[][];
	static boolean visited[];
	static int result[][];
	static BufferedReader bf;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		bf = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(bf.readLine());	
		
		initField(n);
		fillField(n);
		findEdge(n);
		printResult();
	}
	
	public static void printResult() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < result.length;i++) {
			for(int j = 0; j<result[i].length;j++) {
				sb.append(result[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	public static void initField(int n) {
		field = new int[n][n];
		result = new int[n][n];
	}
	
	public static void fillField(int n) throws IOException {
		for(int i = 0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			for(int j= 0 ; j<n;j++) {
				field[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}

	public static void findEdge(int n) {

		for(int i=0;i < n ; i++) {
			visited = new boolean[n];
			queue.add(i);
			while(!queue.isEmpty()) {
				int now = queue.poll();
				for(int j = 0 ;j<n;j++) {
					if(field[now][j]==1&&!visited[j]) {
						visited[j]=true;
						result[i][j] = 1;

						queue.add(j);
					}
						
				}
			}
		}
	}
	

}
