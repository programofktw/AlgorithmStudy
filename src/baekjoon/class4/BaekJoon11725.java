package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaekJoon11725 {
    static HashMap<Integer, List<Integer>> graph = new HashMap<>();
    static boolean[] visited;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int node = Integer.parseInt(br.readLine());

        initGraph(node);


        inputGraph(node, br);


        visited[1] = true;
        dfs(1);

        printResult(node, sb);

    }

    private static void printResult(int node, StringBuilder sb) {
        for(int i = 2; i<= node; i++){
            sb.append(parent[i]).append("\n");
        }

        System.out.print(sb);
    }

    private static void inputGraph(int node, BufferedReader br) throws IOException {
        for(int i = 0; i< node -1; i++){
            String[] lines = br.readLine().split(" ");

            int node1 = Integer.parseInt(lines[0]);

            int node2 = Integer.parseInt(lines[1]);

            graph.get(node1).add(node2);

            graph.get(node2).add(node1);
        }
    }

    private static void initGraph(int node) {
        for(int i = 1; i<= node; i++){
            graph.put(i,new ArrayList<>());
        }

        visited =  new boolean[node+1];
        parent = new int[node+1];
    }


    static void dfs(int node){
        for(int search : graph.get(node)){
            if(!visited[search]){
                visited[search] = true;
                parent[search] = node;
                dfs(search);
            }
        }
    }
}
