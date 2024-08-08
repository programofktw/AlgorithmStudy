package baekjoon.class2;

import java.util.Arrays;
import java.util.Scanner;

public class BackJoon4153 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int array[] = new int[3];
		
		while(true) {
			array[0] = scan.nextInt(); array[1] = scan.nextInt(); array[2] = scan.nextInt();
			if(array[0]==0||array[1]==0 || array[2]==0) break;
			Arrays.sort(array);
			if(array[0]*array[0] + array[1]*array[1] == array[2]*array[2]) System.out.println("right");
			else System.out.println("wrong");
		}
	}
}
