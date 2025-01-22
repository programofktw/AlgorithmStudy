package baekjoon.bronze;

import java.util.Scanner;

public class BaekJoon25841 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int f = scan.nextInt();
        int s = scan.nextInt();
        int findNum = scan.nextInt();

        int count = 0;
        for (int i = f; i <= s; i++) {
            count += countOccurrences(i, findNum);
        }

        System.out.print(count);
    }

    private static int countOccurrences(int number, int digit) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}