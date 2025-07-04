package baekjoon.class3;

import java.util.Arrays;
import java.util.Scanner;
public class BaekJoon11399 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0 ;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		int result=0;
		for(int i = n; i>0;i--) {
			result+= i * arr[n-i];
		}
		
		System.out.println(result);
	}

}
