package baekjoon.class2;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon10828 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		String input;
		
		String order;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N ; i++) {
			
			order = scan.next();
			
			switch(order) {
				case "push" :
					stack.add(scan.nextInt());
					break;
				case "pop" :
					if(stack.isEmpty()) sb.append(-1).append("\n");
					else sb.append(stack.pop()).append("\n");
					break;
				case "top" :
					if(stack.isEmpty()) sb.append(-1).append("\n");
					else sb.append(stack.peek()).append("\n");
					break;
				case "empty" :
					sb.append(stack.isEmpty()?1:0).append("\n");
					break;
				case "size" :
					sb.append(stack.size()).append("\n");
			}
		}
		System.out.println(sb);
	}
}
