package baekjoon.class4;
import java.io.*;
import java.util.*;

public class BaekJoon2206 {

    static boolean[][] field;
    static boolean[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M;

    static class Node {
        int y, x, count;
        boolean broken;

        Node(int y, int x, int count, boolean broken) {
            this.y = y;
            this.x = x;
            this.count = count;
            this.broken = broken;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        field = new boolean[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1][2];

        for (int i = 1; i <= N; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 1; j <= M; j++) {
                field[i][j] = (line[j - 1] == '1');
            }
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(1, 1, 1, false));
        visited[1][1][0] = true;

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            if (now.y == N && now.x == M) {
                System.out.println(now.count);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int ny = now.y + dy[i];
                int nx = now.x + dx[i];

                if (ny < 1 || ny > N || nx < 1 || nx > M) continue;

                int broken = now.broken ? 1 : 0;

                if (field[ny][nx]) {
                    if (broken == 0 && !visited[ny][nx][1]) {
                        visited[ny][nx][1] = true;
                        queue.add(new Node(ny, nx, now.count + 1, true));
                    }
                } else {
                    if (!visited[ny][nx][broken]) {
                        visited[ny][nx][broken] = true;
                        queue.add(new Node(ny, nx, now.count + 1, now.broken));
                    }
                }
            }
        }

        System.out.println(-1);
    }
}