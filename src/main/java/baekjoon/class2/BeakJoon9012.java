package baekjoon.class2;

import java.util.Scanner;
import java.util.Stack;

public class BeakJoon9012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		int N = scan.nextInt();
		String input;
		String result;
		for(int i = 0; i<N;i++) {
			input = scan.next();
			result = "YES";
			for(int j = 0 ; j< input.length();j++) {
				if(input.charAt(j) == '(') stack.add(input.charAt(j));
				else if(input.charAt(j) == ')') {
					if(stack.isEmpty()||stack.peek() != '(' ) {
						result = "NO";
						break;
					}
					else stack.pop();
				}
			}
			if(!stack.isEmpty()) result="NO";
			stack.clear();
			System.out.println(result);
			
		}
	}
}
