package baekjoon.class3;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon2606 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		int computers = scan.nextInt();
		
		int line = scan.nextInt();
		
		int network[][] = new int[computers+1][computers+1];
		
		for(int i = 0; i<line;i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			network[A][B] = 1;
			network[B][A] = 1;
		}
		
		int BC[] = new int[computers+1];
		stack.push(1);
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			if(BC[temp] == 1) continue;
			BC[temp] =1;
			for(int i = 1; i<=computers;i++) {
				if(network[temp][i] ==1 && BC[i]!=1) stack.push(i);
			}
		}
		int sum=0;
		for(int i = 0; i<BC.length;i++) {
			sum+=BC[i];
		}
		
		System.out.print(sum-1);
	}
}
