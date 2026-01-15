package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 위쪽 삼각형
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i)).append("*".repeat(i)).append("\n");
        }

        // 아래쪽 삼각형
        for (int i = n - 1; i >= 1; i--) {
            sb.append(" ".repeat(n - i)).append("*".repeat(i)).append("\n");
        }

        System.out.print(sb);
    }
}