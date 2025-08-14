package baekjoon.class3;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon1541 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stack<Integer> stackNum = new Stack<Integer>();
		Stack<Character> stackOp = new Stack<Character>();
		
		String text = scan.next();
		String temp = "";
		for(int i = 0; i<text.length();i++) {
			char now = text.charAt(i);
			if('0'<=now&&now<='9') {
				temp+=now;
			}
			else {
				stackNum.push(Integer.valueOf(temp));
				temp="";
				stackOp.push(now);
			}
		}
		
		stackNum.push(Integer.valueOf(temp));
		
		int result=0;
		int tempNum=0;
		while(!stackOp.isEmpty()) {
			int n = stackNum.pop();
			char op = stackOp.pop();
			
			if(op=='+') {
				tempNum+=n;
			}
			else {
				tempNum+=n;
				result-=tempNum;
				tempNum=0;
			}
		}
		
		result+=stackNum.pop()+tempNum;
		
		System.out.println(result);
		
	}
}
