package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon1238 {

    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        //마을 수 = 학생 수
        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];


        for(int i = 0;i<=N;i++){
            for(int j = 0 ; j<=N;j++){
                if(i==j) graph[i][j] = 0;
                else{
                    graph[i][j] = Integer.MAX_VALUE;
                }
            }
        }


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            // 같은 노드 간 여러 간선이 있을 수 있음 → 최소 비용만 저장
            graph[u][v] = Math.min(graph[u][v], time);
        }

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (graph[i][k] != Integer.MAX_VALUE && graph[k][j] != Integer.MAX_VALUE &&
                            graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }


        int result=0;
        for(int i = 1;i<=N;i++){
            result = Math.max(graph[i][X] + graph[X][i], result);
        }

        System.out.print(result);

    }

}
