package basic.dfs;

import basic.algorithm.AbstractGraphAlgorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphDFS extends AbstractGraphAlgorithm {

    public static void main(String[] args) throws IOException {
        GraphDFS dfs = new GraphDFS();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dfs.init(br);
        dfs.input(br);
        dfs.printAsGraph();

        System.out.println("DFS 탐색 시작 (시작점 입력): ");
        System.out.print("행(row): ");
        int startRow = Integer.parseInt(br.readLine());
        System.out.print("열(col): ");
        int startCol = Integer.parseInt(br.readLine());

        if(field[startRow][startCol] == 0){
            System.out.println("시작 지점이 이동 불가능합니다.");
            return;
        }

        dfs.dfs(startRow, startCol);
    }

    private static final int[] dx = {-1, 1, 0, 0}; // 상하좌우
    private static final int[] dy = {0, 0, -1, 1};

    private void dfs(int x, int y) {
        visited[x][y] = true;
        printAsVisited();
        // 4방향 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 경계 체크 + 방문 안함 + 이동 가능 (1인 경우)
            if (nx >= 0 && nx < field.length &&
                ny >= 0 && ny < field[0].length &&
                !visited[nx][ny] && field[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}
