package baekjoon.class3;

import java.util.Scanner;

public class BaekJoon20529 {
	public static int[][] MBTIDIFF = new int[16][16];
	public static int[] mbtis;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		mindDiff();
		
		int  T =Integer.parseInt(scan.nextLine());
		
		for(int i = 0;i<T;i++) {
			int peoples = Integer.parseInt(scan.nextLine());

			mbtis = new int[peoples];
			for(int j=0;j<peoples;j++) {
				mbtis[j] = changeMbti(scan.next());
			}
			scan.nextLine();
			System.out.println(countMindDiff(0,0));
		}
	}
	
	public static int countMindDiff(int x, int count) {
		return 0;
	}
	
	public static int changeMbti(String s) {
		int result = 0;
		result += (s.charAt(0)=='I')?0:8;
		result += (s.charAt(1)=='N')?0:4;
		result += (s.charAt(2)=='F')?0:2;
		result += (s.charAt(3)=='J')?0:1;
		return result;
	}
	
	public static void mindDiff() {
		for(int i = 0 ;i <16;i++) {
			for(int j=0;j<16;j++) {
				MBTIDIFF[i][j] = Integer.bitCount(i^j);

			}
			System.out.println();
		}
	}
	
}
