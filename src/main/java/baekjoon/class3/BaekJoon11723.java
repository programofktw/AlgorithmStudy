package baekjoon.class3;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon11723 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> s = new HashSet<Integer>();
		StringBuilder result = new StringBuilder();
		int N = scan.nextInt();
		
		for(int i = 0 ; i< N;i++) {
			String order = scan.next();
			
			switch (order) {
				case "add":
					s.add(scan.nextInt());
					break;
				case "remove" :
					s.remove(scan.nextInt());
					break;
				case "check":
					if (s.contains(scan.nextInt()))  result.append("1").append("\n");
					else result.append("0").append("\n"); 
					break;
				case "toggle":
					int a = scan.nextInt();
					if(s.contains(a)) s.remove(a);
					else s.add(a);
					break;
				case "all":
					for(int j = 1; j<=20;j++) {
						s.add(j);
					}
					break;
				case "empty" :
					s.clear();
					break;
			}
		}
		System.out.println(result);
	}
}
