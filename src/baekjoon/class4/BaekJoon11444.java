package baekjoon.class4;

import java.util.Scanner;

public class BaekJoon11444 {

    private static final long MOD = 1_000_000_007;

    // 행렬 곱셈 (모듈러 연산 포함)
    private static long[][] multiply(long[][] a, long[][] b) {
        long[][] result = new long[2][2];
        result[0][0] = (a[0][0] * b[0][0] % MOD + a[0][1] * b[1][0] % MOD) % MOD;
        result[0][1] = (a[0][0] * b[0][1] % MOD + a[0][1] * b[1][1] % MOD) % MOD;
        result[1][0] = (a[1][0] * b[0][0] % MOD + a[1][1] * b[1][0] % MOD) % MOD;
        result[1][1] = (a[1][0] * b[0][1] % MOD + a[1][1] * b[1][1] % MOD) % MOD;
        return result;
    }

    // 분할 정복을 이용한 행렬의 거듭제곱
    private static long[][] power(long[][] matrix, long n) {
        if (n == 1) return matrix;

        long[][] half = power(matrix, n / 2);
        long[][] result = multiply(half, half);

        if (n % 2 == 1) {
            result = multiply(result, matrix);
        }

        return result;
    }

    // 피보나치 수 F(n) 계산 (mod 1_000_000_007)
    public static long fib(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long[][] base = {{1, 1}, {1, 0}};
        long[][] result = power(base, n - 1);

        return result[0][0];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        System.out.println(fib(n));
    }
}
