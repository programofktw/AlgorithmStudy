package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon4890 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        while (W != 0 && H != 0) {
            int gcd = GCD(W, H);
            long lcm = ((long) W / gcd) * H;
            long ans = lcm / gcd;
            System.out.println(ans);
            W = scanner.nextInt();
            H = scanner.nextInt();
        }
    }

    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
}
