package baekjoon.bronze;

import java.util.Scanner;

public class B31450 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        int K = sc.nextInt();

        System.out.print((M%K)==0?"Yes":"No");
    }

}
