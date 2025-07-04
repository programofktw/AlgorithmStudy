package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon15727 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int result = (N%5!=0)?N/5+1:N/5;
        System.out.println(result);
    }
}
