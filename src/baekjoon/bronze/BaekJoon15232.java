package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon15232 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int R = scan.nextInt();

        int N = scan.nextInt();

        for(int i=0;i<R;i++){
            for(int j=0;j<N;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
