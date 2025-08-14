package baekjoon.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class BaekJoon10757 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		
		System.out.print(a.add(b));
	}
}
