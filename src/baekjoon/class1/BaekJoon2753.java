package baekjoon.class1;

import java.util.Scanner;


//윤년 구하는 문제
public class BaekJoon2753 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int year = scan.nextInt();
		int result = 0;
		
		if((year % 4 == 0 && year % 100 != 0) || year %400 == 0) result = 1;
		else result = 0;
		
		System.out.println(result);
	}
}
