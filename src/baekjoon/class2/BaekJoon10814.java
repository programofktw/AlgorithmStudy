package baekjoon.class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon10814 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		Member[] memberlist = new Member[N];
		Member temp;
		for(int i = 0 ; i <N;i++) {
			memberlist[i] = new Member();
			memberlist[i].age = scan.nextInt();
			memberlist[i].name = scan.next();
		}

		Arrays.sort(memberlist,new Comparator<Member>() {
			// 나이순으로 정렬
			@Override
			public int compare(Member m1, Member m2) {
				return m1.age - m2.age;
			}
			
		});

		
		StringBuilder sb = new StringBuilder();
		
		for(int j= 0 ; j<N;j++) {
				sb.append(memberlist[j]);
		}
		
		System.out.print(sb);
	
	}
}

class Member{
	int age;
	String name;
	
	public String toString() {
		return age + " " + name +"\n";
	}
}


