package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
곱셈 : a ^ b % m 의 연산하기
거듭 제곱 나머지 연산 방법(O(b))과
빠른 거듭 네곱 나머지 연산(O(log b)) 사용해보기
 */
public class BaekJoon1629 {
    
    static long a;
    static long b;
    static long m;
    public static void main(String[] args) throws IOException {
        
        input();

        // modular 방식 시간 측정
        long startTime = System.nanoTime();
        modular();
        long endTime = System.nanoTime();
        System.out.println("modular() 실행 시간: " + (endTime - startTime) + " 나노초");

        // powModular 방식 시간 측정
        startTime = System.nanoTime();
        powModular();
        endTime = System.nanoTime();
        System.out.println("powModular() 실행 시간: " + (endTime - startTime) + " 나노초");
    }
    
    /**
     * a ^ b % m 에서 a 와 b와 m 을 순서대로 입력
     * */
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        a = Long.parseLong(input[0]);
        b = Long.parseLong(input[1]);
        m = Long.parseLong(input[2]);
    }

    public static void modular(){
        long result =1;

        long tempB = b;

        while(tempB-->0){
            result = (result * a) % m;
        }

        System.out.println(result);
    }

    public static void powModular(){
        long base = a % m;
        long exp = b;
        long result = 1;

        while(exp>0){
            if(exp%2==1){
                result = (result * base)%m;
            }
            base = (base * base)%m;

            exp /= 2;
        }

        System.out.println(result);
    }

}
