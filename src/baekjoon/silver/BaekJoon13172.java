package baekjoon.silver;

import java.math.BigInteger;
import java.util.Scanner;

public class BaekJoon13172 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long modul = 1000000007;
		int M = scan.nextInt();
		long N = 1, S = 0;
        //기댓값 합 구하기!
        for(int i=0;i<M;i++) {
            int n = scan.nextInt();
            int s = scan.nextInt();
            //각 분모와 분자를 통분하여 계산
            S = s * N + S * n;
            N *= n;
            //모듈러 산술로 인하여 나머지 계산
            S %= modul;
            N %= modul;
        }
        
        System.out.print((S+modul)/N);
	}
}
