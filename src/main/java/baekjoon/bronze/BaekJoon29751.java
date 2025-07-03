package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon29751 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int W = scan.nextInt();

        int H = scan.nextInt();

        double result = (double) W * H / 2;

        System.out.println(result);
    }
}
