package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon2163 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        System.out.print(N*M-1);
    }
}
