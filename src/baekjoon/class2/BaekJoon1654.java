package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon1654 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		
		int N = scan.nextInt();
		
		long min = 0;
		
		long max = 0;
		
		int kArr[] = new int[K];
		
		long mid = 0;
		long maxLength=0;
		
		for(int i = 0 ; i<K;i++) {
			kArr[i] = scan.nextInt();
			max = (max<kArr[i] ? kArr[i] : max);
		}
		
		max++;
		
		while(min < max) {
			mid = (max + min)/ 2;
			
			long count =0 ;
			
			for(int i = 0 ; i<kArr.length;i++) {
				count += (kArr[i] /mid);
			}
			
			if(count < N) max =mid;
			else min = mid +1;
		}
		maxLength = mid;
		System.out.println(maxLength-1);
	}
	
}
