package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon24603 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = scan.nextInt();

        int x = scan.nextInt();

        int y = scan.nextInt();

        for(int i = 0 ; i<T;i++){
            int a = scan.nextInt();

            int result  = a*y/x;

            sb.append(result).append("\n");
        }

        System.out.println(sb);

    }

}
