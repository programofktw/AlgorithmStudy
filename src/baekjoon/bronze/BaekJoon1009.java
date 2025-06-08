package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon1009 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();


        for(int i = 0 ; i<T;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            int temp =1;
            for(int j=0;j<b;j++){

                temp *= a;
                temp%= 10;
            }

            System.out.println(temp);
        }

    }
}
