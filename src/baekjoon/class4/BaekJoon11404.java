package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon11404 {

    static HashMap<Integer, Integer>[] graph;

    static PriorityQueue<Node> costBfs = new PriorityQueue<>(
            Comparator.comparingInt(o -> o.cost)
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int town = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        graph = new HashMap[town+1];

        for(int i=0;i<town+1;i++){
            graph[i] = new HashMap<>();
        }

        int bus = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 0 ; i<bus;i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());

            int end = Integer.parseInt(st.nextToken());

            int cost = Integer.parseInt(st.nextToken());

            // A -> B로의 여러 노선을 알고 있을 필요 없을 것으로 판단, 가장 비용이 작은 것만 관리
            if(graph[start].get(end)==null || graph[start].get(end) > cost) {
                graph[start].put(end, cost);
            }
        }


        for (int i = 1; i <= town; i++) {
            int[] cost = new int[town + 1];
            boolean[] visited = new boolean[town + 1];
            Arrays.fill(cost, Integer.MAX_VALUE);
            cost[i] = 0;

            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.cost));
            pq.add(new Node(i, 0));

            while (!pq.isEmpty()) {
                Node now = pq.poll();
                if (visited[now.id]) continue;
                visited[now.id] = true;

                for (Map.Entry<Integer, Integer> entry : graph[now.id].entrySet()) {
                    int next = entry.getKey();
                    int nextCost = now.cost + entry.getValue();
                    if (nextCost < cost[next]) {
                        cost[next] = nextCost;
                        pq.add(new Node(next, nextCost));
                    }
                }
            }

            for (int j = 1; j <= town; j++) {
                if (cost[j] == Integer.MAX_VALUE) sb.append("0 ");
                else sb.append(cost[j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);

    }

    static class Node{
        int id;
        int cost;

        Node(int id, int cost){
            this.id = id;
            this.cost = cost;
        }
    }
}
