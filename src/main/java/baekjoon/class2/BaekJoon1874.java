package baekjoon.class2;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon1874 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int max=0;
		
		int N = scan.nextInt();
		
		int popNum =0;
		
		StringBuilder sb = new StringBuilder();
		
		while(popNum < N) {
			int input = scan.nextInt();
			if(max < input) {
				for(int i = max+1; i<=input;i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				max = input;
			}
			if(max >= input){
				if(stack.peek() == input) {
					stack.pop();
					sb.append("-").append("\n");
					popNum++;
				}
				else {
					sb.setLength(0);
					sb.append("NO");
					break;
				}
			}
		}
		
		System.out.println(sb);
	
	}	
}
