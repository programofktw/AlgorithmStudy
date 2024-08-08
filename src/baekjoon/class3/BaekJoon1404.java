package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon1404 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[][] winRate = new double[8][8];
		
		//승률 입력
		for(int i = 0 ;i<8;i++) {
			for(int j = 0; j<8;j++) {
				//자기 자신과 싸워 이길 확률은 주어지지 않음으로 생략
				if(j==i) continue;
				//과거에 입력된 값의 경우 100 - 이전에 입력된 값으로 구함
				else if(j<i) {
					winRate[i][j] = (1 - winRate[j][i]);
				}
				else{
					winRate[i][j] = scan.nextDouble()/100;
				}
			}
		}
		
		double[] round1Win = new double[8];
		double[] round2Win = new double[8];
		double[] round3Win = new double[8];
		//round1 통과 확률
		for(int i = 0; i<8;i++) {
			if(i%2==0) {
				round1Win[i] = winRate[i][i+1];
			}
			else {
				round1Win[i] = winRate[i][i-1];
			}
		}
	
		
		//round2 통과 확률
		for(int i = 0;i<8;i++) {
			int temp = i;
			temp = (temp%2==0)?i:i-1;
			if(i%4==0||i%4==1) {
				round2Win[i] = round1Win[i] * winRate[i][temp+2] *round1Win[temp+2] + round1Win[i] * winRate[i][temp+2+1] *round1Win[temp+2+1];
			}
			else {
				round2Win[i] = round1Win[i] * winRate[i][temp-2] *round1Win[temp-2] + round1Win[i] * winRate[i][temp-2+1] *round1Win[temp-2+1];
			}
		}
		
		
		//round3 계산
		for(int i=0;i<8;i++) {
			int temp;
			if(i<4) {
				temp = 4;	
			}
			else {
				temp = 0;
			}
			for(int j=0;j<4;j++) {
				round3Win[i] += round2Win[i] * winRate[i][temp] * round2Win[temp++];
			}
		}
		
		for(int i = 0 ; i<8;i++) {
			System.out.print(round3Win[i]+" ");	
		}
		
		
	
	}
}
