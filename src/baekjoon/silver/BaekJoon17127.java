package baekjoon.silver;

import java.util.Scanner;

public class BaekJoon17127 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int max = 0;

        // 3개의 커팅 포인트 i, j, k를 선택 (조건: i < j < k)
        for(int i = 1; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int sum = getProduct(arr, 0, i)
                            + getProduct(arr, i, j)
                            + getProduct(arr, j, k)
                            + getProduct(arr, k, n);
                    max = Math.max(max, sum);
                }
            }
        }

        System.out.println(max);
    }

    private static int getProduct(int[] arr, int start, int end) {
        int result = 1;
        for(int i = start; i < end; i++) {
            result *= arr[i];
        }
        return result;
    }
}
