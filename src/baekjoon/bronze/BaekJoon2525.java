package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon2525 {
    public static void main(String[] args){
	       Scanner scan = new Scanner(System.in);
	       int hour = scan.nextInt();
	       int min = scan.nextInt();
	        
	       int time = scan.nextInt();
	        
	       int addhour = time/60;
	       int addmin = time%60;
	        
	       int resulthour = hour+addhour;
	       int resultmin = min+ addmin;
	        
	       if(resultmin >=60){
	          resulthour += resultmin/60;
	          resultmin %=60;
	        }
	       if(resulthour >= 24) resulthour %= 24;
	        
	       System.out.print(resulthour+ " " + resultmin);
    }

}
