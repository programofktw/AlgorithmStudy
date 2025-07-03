package baekjoon.class1;

import java.util.Scanner;

public class BaekJoon2920 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//0 dec 1 mixed 2 asc
		int result = 1;
		
		int pre = scan.nextInt();
		int now;
		int up_down =0;
		int mixed = 0;
		for(int i = 0 ; i<7;i++) {
			now = scan.nextInt();
			if(now == (pre % 8 + 1)) {
				System.out.println("up");
				up_down++;
			}
			else if(now%8 == (pre-1)%8 ) {
				System.out.println("down");
				up_down--;
			}
			else mixed++;
			
			pre = now;
		}
		
		if(mixed!=0) System.out.println("mixed");
		else if(up_down > 0) System.out.print("ascending");
		else System.out.println("descending");
	}
}
