package baekjoon.class2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BaekJoon10866 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Deque<Integer> dq = new ArrayDeque<>();
		int N = scan.nextInt();
	
		String order;

		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i<N;i++) {
			order = scan.next();
			switch (order) {
				case "push_front" :
					dq.addFirst(scan.nextInt());
					break;
				case "push_back" :
					dq.addLast(scan.nextInt());
					break;
				case "pop_front" :
					if(dq.isEmpty()) sb.append("-1").append("\n");
					else sb.append(dq.removeFirst()).append("\n");
					break;
				case "pop_back" :
					if(dq.isEmpty()) sb.append("-1").append("\n");
					else sb.append(dq.removeLast()).append("\n");
					break;
				case "size" :
					sb.append(dq.size()).append("\n");
					break;
				case "empty" :
					sb.append(dq.isEmpty()? 1 : 0).append("\n");
					break;
				case "front" :
					if(dq.isEmpty()) sb.append("-1").append("\n");
					else sb.append(dq.getFirst()).append("\n");
					break;
				case "back" :
					if(dq.isEmpty()) sb.append("-1").append("\n");
					else sb.append(dq.getLast()).append("\n");
			}
		}
		System.out.println(sb);
	}
}
