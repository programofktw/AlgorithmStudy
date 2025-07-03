package baekjoon.bronze;

import java.util.Scanner;

/*
스위치 TV
 */
public class BaekJoon24751 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        double team1 = 100.0 / a;

        double team2 = 100.0 / (100-a);

        System.out.printf("%.10f\n",team1);
        System.out.printf("%.10f",team2);
    }

}
