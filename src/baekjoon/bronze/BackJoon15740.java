package baekjoon.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class BackJoon15740 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        BigInteger A = scan.nextBigInteger();

        BigInteger B = scan.nextBigInteger();

        
        System.out.println(A.add(B));
    }
}
