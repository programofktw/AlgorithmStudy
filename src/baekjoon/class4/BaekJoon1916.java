package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

/*
최소비용 구하기

 */
public class BaekJoon1916 {

    static int[][] graph;

    static int[] moveCost;

    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());


        initGraph(N);


        input(M,br);

        solved(N,br);

    }

    static void initGraph(int N ){
        graph = new int[N+1][N+1];
        moveCost = new int[N+1];
        visited = new boolean[N+1];
        for(int i = 0 ; i<N+1;i++){
            moveCost[i]= Integer.MAX_VALUE;
            for(int j=0;j<N+1;j++){
                graph[i][j] = -1;
            }
        }
    }

    static void input(int M,BufferedReader br) throws IOException {
        for(int i = 0 ; i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            if (graph[start][end] == -1 || graph[start][end] > cost) {
                graph[start][end] = cost;
            }
        }
    }

    static void solved(int N, BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());

        int end = Integer.parseInt(st.nextToken());

        dijkstra(start,N);

        System.out.print(moveCost[end]);


    }

    static void dijkstra(int start,int N){
        PriorityQueue<Node> queue = new PriorityQueue<>(
                Comparator.comparingInt(o -> o.cost)
        );

        moveCost[start] = 0;

        queue.add(new Node(start,0));

        while(!queue.isEmpty()){
            Node now = queue.poll();

            if(moveCost[now.id]<now.cost) continue;

            for(int j =1;j<=N;j++){
                if(graph[now.id][j] ==-1) continue;
                int nextCost = now.cost + graph[now.id][j];

                if(moveCost[j] > nextCost){
                    moveCost[j] = nextCost;
                    queue.add(new Node(j, nextCost));
                }
            }

        }
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
