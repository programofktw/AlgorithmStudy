package baekjoon.class3;

import java.util.Scanner;
import java.io.*;


public class BaekJoon2805 {
	static long M;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//나무의 개수
		int N = scan.nextInt();
		//필요한 나무 길이
		M = scan.nextLong();
	
		long[] trees = new long[N];
		long max=0;
		
		for(int i = 0; i<N;i++) {
			trees[i] = scan.nextLong();
			max = max>trees[i]?max:trees[i];
		}
		
		
		System.out.println(findBest(trees, 0,max));
		
		
	}
	
	public static long findBest(long[] trees,long down, long up) {
		long mid = ((up+down)%2)==0?(up+down)/2:((up+down)/2)+1;
		if(up==down) {
			return mid;
		}
		else {
			long temp = cutting(trees, mid);
			if(temp>M) {
				
				return findBest(trees,mid,up);
			}
			else if(temp==M) {
				return  mid;
			}
			else {
				long newUp = (up+down)/2;
				return findBest(trees,down,newUp);
			}
		}
	}
	
	public static long cutting(long[] trees,long high) {
		long remine=0;
		
		for(int i =0; i<trees.length;i++) {
			long temp = trees[i]-high;
			remine += temp>=0?temp:0;
		}
		
		return remine;
	}
}
