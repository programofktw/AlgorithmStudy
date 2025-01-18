package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon15115 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double K = scan.nextDouble();

        double P = scan.nextDouble();

        double X = scan.nextDouble();

        // 최적의 화가 수 계산
        double optimalM = Math.sqrt((K * P) / X);

        // 최적의 화가 수를 정수로 변환 (반올림)
        int roundedM = (int) Math.round(optimalM);

        // 최소 비용 계산
        double minCost = roundedM * X + (K / roundedM) * P;

        // 최솟값 f(M) 계산
        double minValue = X * roundedM + (P * K) / roundedM;

        System.out.printf("%.3f",minValue);
    }
}
