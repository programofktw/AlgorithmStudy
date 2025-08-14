package baekjoon.silver;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon1312 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();

        int result = a % b; // 정수 영역의 나머지 구함

        for(int i=0; i<n-1; i++){ // 그 나머지의 10을 곱해 다음 자리 나머지를 구함
            result *= 10;
            result %= b;
        }

        result *= 10;

        System.out.println(result/b);
    }
}
