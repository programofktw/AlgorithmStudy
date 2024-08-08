package baekjoon.class1;

import java.util.Scanner;

//시험 성적
public class BaekJoon9498 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		char grade =' ';
		if(score >= 90) grade = 'A';
		else if(score>=80) grade = 'B';
		else if(score>=70) grade = 'C';
		else if(score>=60) grade = 'D';
		else grade = 'F';
	
		System.out.println(grade);
	}
}
