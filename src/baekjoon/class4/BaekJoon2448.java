package baekjoon.class4;

import java.util.Scanner;

public class BaekJoon2448 {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new char[N][2 * N - 1];

        // 공백 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                arr[i][j] = ' ';
            }
        }

        drawTriangle(N, 0, N - 1);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    // N 높이의 삼각형을 (x, y) 꼭짓점 중심에 그리기
    static void drawTriangle(int size, int x, int y) {
        if (size == 3) {
            arr[x][y] = '*';
            arr[x + 1][y - 1] = '*';
            arr[x + 1][y + 1] = '*';
            for (int i = -2; i <= 2; i++) {
                arr[x + 2][y + i] = '*';
            }
            return;
        }

        int newSize = size / 2;
        // 위 삼각형
        drawTriangle(newSize, x, y);
        // 왼쪽 아래 삼각형
        drawTriangle(newSize, x + newSize, y - newSize);
        // 오른쪽 아래 삼각형
        drawTriangle(newSize, x + newSize, y + newSize);
    }
}
