package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon2446 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i = 0 ; i <N;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=2*(N-i)-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1;i<N;i++){
            for(int j=(N-i)-1; j>0;j--){
                System.out.print(" ");
            }

            for(int j = 2*i+1;j>0;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
