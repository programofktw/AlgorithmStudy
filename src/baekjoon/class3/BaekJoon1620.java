package baekjoon.class3;

import java.util.HashMap;
import java.util.Scanner;

public class BaekJoon1620 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N  = scan.nextInt();
		int M  = scan.nextInt();
		
		HashMap<Integer, String> Id_Name = new HashMap<>();
		HashMap<String, Integer> Name_Id = new HashMap<>();
		
		for(int i = 1 ; i  <=N ;i++) {
			String name = scan.next();
			Id_Name.put(i, name);
			Name_Id.put(name, i);
		}
		
		for(int i = 0 ; i <M;i++) {
			String order = scan.next();
			if(order.charAt(0) <= '9' && order.charAt(0)>='0') sb.append(Id_Name.get(Integer.parseInt(order))).append("\n");
			else sb.append(Name_Id.get(order)).append("\n");
		}
	
		System.out.println(sb);
	}
}
