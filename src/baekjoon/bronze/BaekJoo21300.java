package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoo21300 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i < 6; i++) {
            result += scanner.nextInt();
        }

        System.out.print(result * 5);
    }
}
