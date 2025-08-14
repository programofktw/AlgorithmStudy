package baekjoon.bronze;

import java.util.Scanner;
public class BaekJoon10984 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int T = scan.nextInt();

        while(T>0){
            int N = scan.nextInt();
            int CSum = 0;
            double G = 0;
            for(int i = 0 ; i <N;i++){
                int C = scan.nextInt();
                CSum += C;
                G += C*scan.nextDouble();
            }
            G /= CSum;


            System.out.printf("%d %.1f\n",CSum,G);


            T--;
        }
    }
}
