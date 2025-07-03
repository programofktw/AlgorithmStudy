package baekjoon.class2;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2108 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] array = new int[N];
	
		for(int i= 0; i<N;i++) {
			array[i] = scan.nextInt();
		}
		
		Arrays.sort(array);
		
		int mid = array[N/2];
		int minmax = array[N-1] - array[0];
		long avg = Math.round((double)sum(array)/N);
		int mode = modeing(array);
		System.out.println(avg+"\n"+mid+"\n"+mode+"\n"+minmax);
		
	}
	
	public static int sum(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}
	

	public static int modeing(int[] array) {
	
		int pre=0;
		int count = 0;
		int temp = 1;
		boolean second=false;
		
		int[] modeArray = new int[8001];
		int arrayValue;
		
		for(int i = 0;i<array.length;i++) {
			arrayValue = array[i] + 4000;
			modeArray[arrayValue]++;
		}
		
		for(int i = 0 ; i<=8000;i++) {
			if(count < modeArray[i]) {
				count = modeArray[i];
				pre = i-4000;
				second = false;
			}
			
			else if(count == modeArray[i] && !second) {
				pre = i -4000;
				second = true;
			}
		}
		
/*		for(int i = 1; i<array.length; i++) {
//			if(array[i]==array[i-1]) temp++;
//			
//			else {
//				if(count < temp) {
//					count = temp;
//					pre = array[i-1];
//					temp = 1;
//					second = false;
//				}
//				else if (count == temp && !second) {
//					pre = array[i-1];
//					temp = 1;
//					second = true;
//				}
//			}
//		}
//		if(count < temp) {
//			count = temp;
//			pre = array[array.length-1];
//			temp = 1;
//			second = false;
//		}
//		else if (count == temp && !second) {
//			pre = array[array.length-1];
//			temp = 1;
//			second = true;
//		}
		*/
		return pre;
	}
}
