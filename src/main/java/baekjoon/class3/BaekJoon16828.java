package baekjoon.class3;

import java.io.*;
import java.util.*;

public class BaekJoon16828 {
    static int[] board = new int[100];
    static boolean[] visited = new boolean[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] jump = new int[100];
        for (int i = 0; i < 100; i++) {
            jump[i] = i;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int ladder = Integer.parseInt(st.nextToken());
        int snake = Integer.parseInt(st.nextToken());

        for (int i = 0; i < ladder + snake; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;
            jump[from] = to;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int now = q.poll();

            for (int dice = 1; dice <= 6; dice++) {
                int next = now + dice;

                if (next >= 100 || visited[jump[next]]) continue;

                visited[jump[next]] = true;
                board[jump[next]] = board[now] + 1;
                q.add(jump[next]);
            }
        }

        System.out.println(board[99]);
    }
}