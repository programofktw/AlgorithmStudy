package baekjoon.class3;

import java.util.*;


public class BaekJoon9375 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i= 0; i<T;i++) {
			int N = scan.nextInt();
			int result = 0;
			int c = 0;
			
			Map<String,List<String>> map = new HashMap<String,List<String>>();
			
			for(int j=0 ; j<N; j++) {
				String name = scan.next();
				String w = scan.next();
				if(map.containsKey(w)) {
					map.get(w).add(name);
				}
				else {
					map.put(w, new ArrayList<String>());
					map.get(w).add(name);
				}
			}
			
			
			if(map.size()>1) c= 1;
			Set key = map.keySet();
			Iterator it = key.iterator();
			while(it.hasNext()) {
				int a = map.get(it.next()).size();
				c*=(a+1);
			}
			if(map.size()>1)
				result = c-1;
			else {
				result = N;
			}
			sb.append(result).append("\n");
			
		}
		
		System.out.println(sb);
	}
}
