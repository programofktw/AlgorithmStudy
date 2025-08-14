package baekjoon.class4;

import java.util.Scanner;

public class BaekJoon15650 {

	static int N;
	static int M;
	static boolean[] visited;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();

		M = scan.nextInt();

		visited = new boolean[N+1];

		backTraking(2,"1");
		backTraking(2,"");


		
	}

	public static void backTraking(int now,String result){
		if(result.length()==M*2-1) System.out.println(result);
		else if(now>N) return;
		else{
			if(!result.isEmpty()){
				backTraking(now+1,result+" "+now);
			}
			else{
				backTraking(now+1,""+now);
			}
			backTraking(now+1,result);
		}

	}

}
