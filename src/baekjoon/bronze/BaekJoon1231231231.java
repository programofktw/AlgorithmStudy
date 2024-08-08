package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon1231231231 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	
			long X = scanner.nextLong();
			int N = scanner.nextInt();
			long sum=0;
			int i = 0;
	
			while(i<N){
				i++;
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				sum += a*b;
			}
			if(X==sum)
				System.out.println("yes");
			else if (X!=sum)
				System.out.println("No");
		}
}
