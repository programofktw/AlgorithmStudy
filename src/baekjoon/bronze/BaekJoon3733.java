package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon3733 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            int n = scan.nextInt();
            int s = scan.nextInt();
            System.out.println(s/(n+1));
        }
    }
}
