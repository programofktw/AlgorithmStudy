package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon11047 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] coin = new int[scan.nextInt()];
		
		int K = scan.nextInt();
		
		int[] coinNum = new int[K+1];
		
		for(int i = 0; i<coin.length;i++) {
			coin[i] = scan.nextInt();
			if(coin[i]<=K)
			coinNum[coin[i]]=1;
		}
		
		coinNum[0] = 0;
		
		
		A : for(int i = 1; i<coinNum.length;i++) {
			coinNum[i] = i/coin[0];	
			for(int j = 0; j<coin.length;j++) {
				if(coin[j] > i) continue A;
				else coinNum[i] = Math.min(coinNum[i], coinNum[i-coin[j]]+1);
			}
		}
		
		System.out.println(coinNum[K]);
		
	}
}
