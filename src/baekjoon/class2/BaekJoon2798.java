package baekjoon.class2;

import java.util.Scanner;


//블랙잭
public class BaekJoon2798 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] card = new int[N];
		int temp;
		int max = 0;
		
		for(int i =0;i<N;i++) {
			card[i] = scan.nextInt();
		}
		
		
		for(int i = 0; i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int h = j+1;h<N;h++) {
					temp=card[i]+card[j]+card[h];
					if(temp<=M && temp>max) max = temp; 
				}
			}
		}
		
		System.out.println(max);
	}
}
