package baekjoon.class4;
import java.io.*;
import java.util.*;

public class BaekJoon1865 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static class Edge {
        int from, to, weight;
        Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 지점 수
            int m = Integer.parseInt(st.nextToken()); // 도로 수
            int w = Integer.parseInt(st.nextToken()); // 웜홀 수

            List<Edge> edges = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());

                edges.add(new Edge(s, e, t));
                edges.add(new Edge(e, s, t));
            }

            for (int i = 0; i < w; i++) {
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());

                edges.add(new Edge(s, e, -t));
            }

            for (int i = 1; i <= n; i++) {
                edges.add(new Edge(0, i, 0));
            }

            if (hasNegativeCycle(n, edges)) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }

    static boolean hasNegativeCycle(int n, List<Edge> edges) {
        int[] dist = new int[n + 1]; // 0번 노드 포함
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0; // 시작은 가상의 0번 노드

        for (int i = 0; i < n; i++) {
            for (Edge edge : edges) {
                if (dist[edge.from] != Integer.MAX_VALUE &&
                        dist[edge.to] > dist[edge.from] + edge.weight) {
                    dist[edge.to] = dist[edge.from] + edge.weight;
                }
            }
        }

        // n번째 루프에서 갱신되면 음수 사이클 존재
        for (Edge edge : edges) {
            if (dist[edge.from] != Integer.MAX_VALUE &&
                    dist[edge.to] > dist[edge.from] + edge.weight) {
                return true;
            }
        }

        return false;
    }
}
