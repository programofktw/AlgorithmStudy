package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon10250 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 0; i<T;i++) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();
			int XX = (N-1) / H +1;
			int YY = N % H;
			if(YY == 0 ) YY=H;
			if(XX<10)
				System.out.println(YY+"0"+XX);
			else
				System.out.println(YY+""+XX);
		}
	}
}
