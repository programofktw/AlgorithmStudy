package baekjoon.class2;

import java.util.Scanner;
import java.util.Stack;

public class BeakJoon10773 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
	
		int N = scan.nextInt();
		
		int input;
		
		int sum = 0;
		
		for(int i = 0 ; i<N;i++) {
			input = scan.nextInt();
			
			if(input == 0 ) stack.pop();
			else stack.add(input);
		}
		
		while(!stack.isEmpty()) {
			sum+= stack.pop();
		}
		
		System.out.println(sum);
	}
}
