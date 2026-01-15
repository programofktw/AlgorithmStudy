package basic.bfs;

import basic.algorithm.AbstractGraphAlgorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS extends AbstractGraphAlgorithm {

    private static final int[] dx = {-1, 1, 0, 0}; // 상하좌우
    private static final int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        GraphBFS bfs = new GraphBFS();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        bfs.init(br);
        bfs.input(br);
        bfs.printAsGraph();

        System.out.println("BFS 탐색 시작 (시작점 입력): ");
        System.out.print("행(row): ");
        int startRow = Integer.parseInt(br.readLine());
        System.out.print("열(col): ");
        int startCol = Integer.parseInt(br.readLine());

        bfs.bfs(startRow, startCol);
    }

    private void bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();

        // 시작점이 이동 불가능한 경우
        if (field[x][y] != 1) {
            System.out.println("시작 지점이 이동 불가능합니다.");
            return;
        }

        visited[x][y] = true;
        printAsVisited();
        queue.add(new Node(x, y));

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx >= 0 && nx < field.length &&
                    ny >= 0 && ny < field[0].length &&
                    !visited[nx][ny] && field[nx][ny] == 1) {

                    visited[nx][ny] = true;
                    printAsVisited();
                    queue.add(new Node(nx, ny));
                }
            }
        }
    }

    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
