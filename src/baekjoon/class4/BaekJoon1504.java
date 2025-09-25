package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon1504 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static Map<Integer, List<Node>> graph = new HashMap<>();

    static int[][] distances;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        //Node 개수
        int N = Integer.parseInt(st.nextToken());

        //간선 개수
        int E = Integer.parseInt(st.nextToken());

        // 0 : 1 ~
        // 1 : v1 ~
        // 2 : v2 ~
        distances = new int[3][N+1];

        for(int i = 0 ; i < 3;i++)
           Arrays.fill(distances[i],-1);

        for(int i = 1; i <=N ;i++){
            graph.put(i,new ArrayList<>());
        }

        for(int i  =0 ; i < E; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());

            int end = Integer.parseInt(st.nextToken());

            int cost = Integer.parseInt(st.nextToken());

            graph.get(start).add(new Node(start, end, cost));
            graph.get(end).add(new Node(end, start, cost));
        }

        st = new StringTokenizer(br.readLine());

        int v1 = Integer.parseInt(st.nextToken());

        int v2 = Integer.parseInt(st.nextToken());

        bfs(1,0);
        bfs(v1,1);
        bfs(v2,2);


        if(distances[1][N] == -1 || distances[2][N]==-1){
            System.out.print(-1);
        }else{
            int mid1 = distances[1][v2];
            int mid2 = distances[1][1] + distances[1][v2];

            int midResult = Math.min(mid1,mid2);

            int edge1 = distances[0][v1] + distances[2][N];

            int edge2 = distances[0][v2] + distances[1][N];

            int edgeResult = Math.min(edge1,edge2);

            System.out.print(midResult + edgeResult);
        }



        //경우의 수
        //1. 1 -> v1 -> v2 ->
        //2. 1 -> v2 -> v1 -> N
        //3. 1 -> v1 -> 1 -> v2 -> N
        //4. 1 -> v2 -> 1 -> v1 -> N



    }

    static void bfs(int baseNode, int key){
        PriorityQueue<Node> queue = new PriorityQueue<>(
                Comparator.comparingInt(o -> o.cost)
        );


        // 시작점 거리 0으로 설정
        distances[key][baseNode] = 0;
        queue.add(new Node(baseNode, baseNode, 0));


        while(!queue.isEmpty()){
            Node now = queue.poll();

            if (distances[key][now.end] < now.cost) continue;

            for(Node next : graph.get(now.end)){
                int newCost = now.cost + next.cost;

                if (distances[key][next.end] == -1 || distances[key][next.end] > newCost) {
                    distances[key][next.end] = newCost;
                    queue.add(new Node(now.end, next.end, newCost));
                }
            }
        }
    }

    static void dijkstra(int baseNode, int key) {
        PriorityQueue<Node> queue = new PriorityQueue<>(
                Comparator.comparingInt(o -> o.cost)
        );

        // 시작점 거리 0으로 설정
        distances[key][baseNode] = 0;
        queue.add(new Node(baseNode, baseNode, 0));

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            // 이미 더 짧은 경로가 있으면 스킵
            if (distances[key][now.end] < now.cost) continue;

            for (Node next : graph.get(now.end)) {
                int newCost = now.cost + next.cost;
                if (distances[key][next.end] == -1 || distances[key][next.end] > newCost) {
                    distances[key][next.end] = newCost;
                    queue.add(new Node(now.end, next.end, newCost));
                }
            }
        }
    }


    static class Node{
        int start;
        int end;
        int cost;

        public Node(int x, int y, int cost) {
            this.start = x;
            this.end = y;
            this.cost = cost;
        }
    }
}
