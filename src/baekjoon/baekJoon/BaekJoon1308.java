package baekjoon.baekJoon;

import java.util.Scanner;

public class BaekJoon1308 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int year1 = scan.nextInt();
		int month1 = scan.nextInt();
		int day1= scan.nextInt();
		int year2 = scan.nextInt();
		int month2 = scan.nextInt();
		int day2 = scan.nextInt();
		
		
		long d_day=0;

		//1000년 이 넘는 경우 (gg 조건)
		if(year2-year1 >1000||(year2-year1==1000 && month2-month1>0)||((year2-year1==1000 && month2-month1==0&&day2-day1>=0))) {
			System.out.println("gg");
			return;
		}
		
		long temp_day1=0;
		int temp_day2=0;

		//1년 1월 1일~ x 년 1월 1일 까지 일 수 구하기
		for(int i = 1 ; i<year1;i++) {
			if((i%4==0&&!(i%100==0))||i%400==0) {
				temp_day1+=366;
			}
			else {
				temp_day1+=365;
			}
		}


		//1년 1월 1일~ x 년 1월 1일 까지 일 수 구하기
		for(int i = 1 ; i<year2;i++) {
			if(i%4==0&&!(i%100==0)||i%400==0) {
				temp_day2+=366;
			}
			else {
				temp_day2+=365;
			}
		}
		

		//x년 1월 1일부터 x년 x월 1일까지의 일수 구하기
		for(int i =1; i<month1;i++) {
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
				temp_day1+=31;
			}
			else if(i==2) {
				//2월인 경우 올해가 윤년이라면 1을 더하게끔.
				temp_day1+=28;
				if(month1>=3&&(year1%4==0&&!(year1%100==0)||year1%400==0)) temp_day1++;
			}
			else {
				temp_day1+=30;
			}
		}
		//1년 1월 1일 ~ x년 x월 1일까지
		
		temp_day1+=day1;
		
		
		for(int i=1; i<month2;i++) {
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
				temp_day2+=31;
			}
			else if(i==2) {
				temp_day2+=28;
				if((year2%4==0&&!(year2%100==0)||year2%400==0)&&month2>=3)temp_day2++;
			}
			else {
				temp_day2+=30;
			}
		}
		
		temp_day2+=day2;
		
		d_day = temp_day2-temp_day1;
		System.out.print("D-"+d_day);
	}
}
