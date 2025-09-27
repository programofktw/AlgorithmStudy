package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon14647 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        int total9num = 0;
        int[] rowCount = new int[n];
        int[] colCount = new int[m];

        // 입력 및 9 카운팅
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                String s = st.nextToken();
                arr[i][j] = Integer.parseInt(s);

                // 9의 개수 세기
                for (char c : s.toCharArray()) {
                    if (c == '9') {
                        total9num++;
                        rowCount[i]++;
                        colCount[j]++;
                    }
                }
            }
        }

        // 최대 9 개수 찾기 (행/열)
        int max9Num = 0;
        for (int r : rowCount) max9Num = Math.max(max9Num, r);
        for (int c : colCount) max9Num = Math.max(max9Num, c);

        System.out.println(total9num - max9Num);
    }
}
