package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BaekJoon18870 {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> set = new HashSet<Integer>();
	
		int n = Integer.valueOf(bf.readLine());
	
		String[] Xs = bf.readLine().split(" ");
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int[] arr = new int[n];
		
		for(int i = 0 ; i<n;i++) {
			int a = Integer.valueOf(Xs[i]);
			arr[i] =(a);
			set.add(a);
		}
		
		Integer[] arrays = set.toArray(new Integer[0]);
		Arrays.sort(arrays);
		
		
		for(int i = 0 ; i<arrays.length;i++) {
			map.put(arrays[i],i);
		}
		

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i<arr.length;i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.print(sb);
		
	}

}
