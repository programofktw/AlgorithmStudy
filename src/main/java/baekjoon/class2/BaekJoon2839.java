package baekjoon.class2;

import java.util.Scanner;

public class BaekJoon2839 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int kg = scan.nextInt();
		
		int[] num = new int[kg+1];
		
		for(int i = 0;i<num.length;i++) {
			num[i] = -1;
		}
		
		num[0] = 0;
		num[3] = 1;
		if(num.length>=6) num[5] = 1;
		for(int i = 6; i<num.length;i++) {
			if(num[i-3]>=0 && num[i-5]>=0) {
				num[i] = Math.min(num[i-3], num[i-5])+1;
			}
			else if(num[i-3]>=0) num[i] = num[i-3]+1;
			else if(num[i-5]>=0) num[i] = num[i-5]+1;
		}
		
		System.out.print(num[kg]);
	}
}
