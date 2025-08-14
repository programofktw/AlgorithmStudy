package baekjoon.class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaekJoon1920 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] baseInput = new int[N];
		
		
		for(int i=0;i<N;i++) {
			baseInput[i] = scan.nextInt();
		}

		
		int N2 = scan.nextInt();
		
		int input, result;
		Arrays.sort(baseInput);
		for(int i=0;i<N2;i++) {
			input = scan.nextInt();
			result = binarySearch(baseInput, input, 0, N-1);
			System.out.println(result);
			
		}
		
	}
	
	public static int binarySearch(int[] baseInput, int input, int start, int end) {
		int mid;
		while(start <= end) {
			mid = (start+end)/2;
			if(baseInput[mid]==input) return 1;
			else if(baseInput[mid]>input) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		
		return 0;
	}
}
