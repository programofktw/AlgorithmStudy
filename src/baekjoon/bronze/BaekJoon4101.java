package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon4101 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt(); int b = scan.nextInt();
			String result= new String();
			if(a==0&&b==0) break;
			if(a>b) result = "Yes";
			else result= "No";
			System.out.println(result);
		}
		
	}
}
