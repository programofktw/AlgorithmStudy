package baekjoon.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class BaekJoon8437 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        BigInteger sum = scan.nextBigInteger();

        BigInteger diff = scan.nextBigInteger();

        BigInteger a = sum.add(diff).divide(BigInteger.TWO);

        BigInteger b = sum.subtract(a);

        System.out.println(a+"\n"+b);
    }
}
