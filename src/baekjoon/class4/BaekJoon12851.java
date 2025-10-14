package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//1회차 메모리 초과
//시도 변경 dp 대신 bfs를 하되 add 하기전 time이 minTime 보다 큰지 확인.
//Periority Queue -> Queue 변경 : 시간복잡도는 좀 버려도 공간 복잡도 살려보기
public class BaekJoon12851 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());


        int from = Integer.parseInt(st.nextToken());

        int to = Integer.parseInt(st.nextToken());

        if(from>=to){
            System.out.println(from-to);
            System.out.println(1);
            return;
        }

        bfs(from, to);

    }

    private static void bfs(int from, int to) {

        int MAX = 100000;
        int[] visited = new int[MAX + 1];  // -1이면 방문 안함, 아니면 방문 시간 기록

        Arrays.fill(visited, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(from);
        visited[from] = 0;

        int minTime = Integer.MAX_VALUE;
        int count = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            int time = visited[now];

            //목적지에 도착
            if (now == to) {
                if (time < minTime) {
                    minTime = time;
                    count = 1;
                } else if (time == minTime) {
                    count++;
                }
                continue;
            }

            //최소 시간보다도 클때
            if (time + 1 > minTime) continue;

            int[] next = {now - 1, now + 1, now * 2};

            for (int nx : next) {
                if (nx < 0 || nx > MAX) continue;

                //아직 방문을 하지 않았거나 또 방문을 했는 데 시간이 같다(같은 시간에 다른 경로로 왔다)
                if (visited[nx] == -1 || visited[nx] == time + 1) {
                    visited[nx] = time + 1;
                    queue.add(nx);
                }
            }
        }
        System.out.println(minTime);
        System.out.println(count);
    }

    static class Node{
        int X;


        int time;

        Node(int X, int time){
            this.X = X;
            this.time = time;
        }
    }
}
