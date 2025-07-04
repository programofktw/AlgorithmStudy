package baekjoon.seed;

import java.math.BigInteger;
import java.util.*;

public class Rich {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        BigInteger money = scan.nextBigInteger();
        BigInteger people = scan.nextBigInteger();
        
        System.out.println(money.divide(people));
        System.out.println(money.remainder(people));
    }
}
