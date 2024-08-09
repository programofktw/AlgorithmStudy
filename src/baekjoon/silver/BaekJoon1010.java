package baekjoon.silver;

import java.math.BigInteger;
import java.util.Scanner;

public class BaekJoon1010 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i = 0 ; i<T;i++){
            int N = scan.nextInt();
            int M = scan.nextInt();

            BigInteger hat = BigInteger.ONE;
            BigInteger bottom=BigInteger.ONE;

            for(int j = M; j>M-N;j--){
                hat = hat.multiply(BigInteger.valueOf(j));
            }
            for(int j = N; j>=1;j--){
                bottom = bottom.multiply(BigInteger.valueOf(j));
            }

            System.out.println(hat.divide(bottom).toString());
        }
    }
}
