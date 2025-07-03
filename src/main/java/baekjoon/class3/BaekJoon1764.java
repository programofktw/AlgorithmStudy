package baekjoon.class3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon1764 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder result = new StringBuilder();
		
		Set<String> hear = new HashSet<String>();
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		Set<String> hear_see = new HashSet<String>();
		
		for(int i = 0 ; i<n;i++) {
			hear.add(scan.next());
		}
		
		for(int i = 0; i<m;i++) {
			String see = scan.next();
			if(hear.contains(see)) hear_see.add(see);
		}
		
		String[] hear_see_Array = hear_see.toArray(new String[0]);
		Arrays.sort(hear_see_Array);
		result.append(hear_see_Array.length).append("\n");
		
		for(int i =0;i<hear_see_Array.length;i++) {
			result.append(hear_see_Array[i]).append("\n");
		}
		
		System.out.println(result);
	}
}
