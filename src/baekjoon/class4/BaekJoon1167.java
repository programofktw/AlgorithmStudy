package baekjoon.class4;

import basic.datastructure.map.HashMap;
import basic.datastructure.map.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon1167 {

    /*
    트리의 지름 문제인데 이전과 다른 점으로는
    입력이 간선 하나씩이 아닌 특정 노드에 연결된 모든 노드들로 부터 이루어지는 차이가 존재
    입력 다른것만 처리해주면 될 것으로 예상.
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static Map<Integer, List<Node>> graph = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        init(n);

        input(n);

        System.out.print(searchResult());
    }

    static void init(int n){
        for(int i=1;i<=n;i++){
            graph.put(i,new ArrayList<>());
        }
    }

    static void input(int n) throws IOException {
        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());

            while(true){
                int to = Integer.parseInt(st.nextToken());
                if(to==-1) break;

                int weight = Integer.parseInt(st.nextToken());

                graph.get(from).add(new Node(to, weight));
            }
        }
    }

    static int searchResult(){
        return di(farNode());
    }

    static int farNode(){
        Queue<Node> queue = new LinkedList<>();

        boolean[] visited = new boolean[graph.size()+1];
        queue.add(new Node(1,0));
        int farNode = 1;
        int max = 0;
        while(!queue.isEmpty()){
            Node nowNode = queue.poll();
            if(visited[nowNode.num]) continue;
            else{
                List<Node> linkNodes = graph.get(nowNode.num);
                for(Node linkNode : linkNodes){
                    if(visited[linkNode.num]) continue;
                    else{
                        queue.add(new Node(linkNode.num, linkNode.weight+ nowNode.weight));
                    }
                }
                visited[nowNode.num] = true;
                if(max < nowNode.weight){
                    max = nowNode.weight;
                    farNode = nowNode.num;
                }
            }
        }
        return farNode;
    }

    static int di(int i){
        Queue<Node> queue = new LinkedList<>();

        boolean[] visited = new boolean[graph.size()+1];
        queue.add(new Node(i,0));
        int max = 0;
        while(!queue.isEmpty()){
            Node nowNode = queue.poll();
            if(visited[nowNode.num]) continue;
            else{
                List<Node> linkNodes = graph.get(nowNode.num);
                for(Node linkNode : linkNodes){
                    if(visited[linkNode.num]) continue;
                    else{
                        queue.add(new Node(linkNode.num, linkNode.weight+ nowNode.weight));
                    }
                }
                visited[nowNode.num] = true;
                if(max < nowNode.weight){
                    max = nowNode.weight;
                }
            }
        }
        return max;

    }

    static class Node{
        int num;
        int weight;

        Node(int num, int weight){
            this.num = num;
            this.weight = weight;
        }
    }

}
