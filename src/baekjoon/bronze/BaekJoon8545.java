package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon8545 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        for(int i= str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
