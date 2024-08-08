package baekjoon.class2;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon4949 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input;
		
		while(true) {
			input = scan.nextLine();
			if(input.equals(".")) break;
			
			if(균형(input)) System.out.println("yes");
			else System.out.println("no");
		}
		
	}
	
	public static boolean 균형(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i) == '(' ||s.charAt(i) == '[' ) stack.add(s.charAt(i));
			
			else if(s.charAt(i) == ')') {
				if( stack.isEmpty()||stack.pop() != '(') return false;
			}
			
			else if(s.charAt(i) == ']' ) {
				if(stack.isEmpty()||stack.pop() != '[' ) return false;
			}
		}
		
		if(stack.isEmpty())	return true;
		else return false;
	}
}
