package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon28281 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        int wear = scan.nextInt();



        int[] dayPrice = new int[day];
        for(int i = 0 ; i<day;i++){
            dayPrice[i] = scan.nextInt();
        }

        int result = dayPrice[0]+dayPrice[1];

        for(int i = 1 ;i<day-1;i++){
            if(result>dayPrice[i]+dayPrice[i+1]) result = dayPrice[i] + dayPrice[i+1];
        }

        System.out.println(result*wear);
    }
}
