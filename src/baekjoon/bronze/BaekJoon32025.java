package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon32025 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        if(a<b){
            System.out.printf("%.0f", a/2*100);
        }
        else{
            System.out.printf("%.0f", b/2*100);
        }
    }
}
