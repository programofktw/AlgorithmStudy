package baekjoon.bronze;

import java.util.Scanner;

public class B20651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flowers = new int[n];
        for (int i = 0; i < n; i++) {
            flowers[i] = sc.nextInt();
        }

        int count = 0;
        // 1. 모든 연속된 부분 수열(i부터 j까지) 선정
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += flowers[k];
                }

                // 부분 수열의 길이
                int len = j - i + 1;

                // 2. 평균값이 정수인지 확인 (합이 길이로 나누어 떨어져야 함)
                if (sum % len == 0) {
                    int average = sum / len;

                    // 3. 평균값이 부분 수열에 포함되는지 확인
                    for (int k = i; k <= j; k++) {
                        if (flowers[k] == average) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}