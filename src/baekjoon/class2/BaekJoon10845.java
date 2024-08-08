package baekjoon.class2;

import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon10845 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		int N = scan.nextInt();
		
		String order;
		
		StringBuilder sb = new StringBuilder();
		
		int num;
		for(int i = 0 ; i< N ;i++) {
			order = scan.next();
			
			switch(order) {
				case "push" :
					queue.add(scan.nextInt());
					break;
				case "pop" :
					if(queue.isEmpty()) sb.append(-1);
					else sb.append(queue.poll());
					break;
				case "size" :
					sb.append(queue.size());
					break;
				case "empty" :
					sb.append(queue.isEmpty()?1:0);
					break;
				case "front" :
					if(queue.isEmpty()) sb.append(-1);
					else sb.append(queue.get(0));
					break;
				case "back" :
					if(queue.isEmpty()) sb.append(-1);
					else sb.append(queue.get(queue.size()-1));
					break;
			}
			if(!order.equals("push")) sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
