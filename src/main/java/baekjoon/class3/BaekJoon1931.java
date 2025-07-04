package baekjoon.class3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon1931 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[][] times = new int[N][2];
		
		for(int i = 0 ; i<N;i++) {
			times[i][0] = scan.nextInt();
			times[i][1] = scan.nextInt();
		}
		
		Arrays.sort(times, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
			
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			
			if(prev_end_time <= times[i][0]) {
				prev_end_time = times[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}
}
