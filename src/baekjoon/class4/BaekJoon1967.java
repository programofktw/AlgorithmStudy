package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon1967 {
    /*
    트리의 지름 찾기.
    트리에서 가장 가중치 합이 큰 경로 찾기

    특정 노드에서 다른 모든 노드 중 가장 큰 가중치.

    근데 사실 리프 노드에서 다른 리프 노드까지의 길이만 측정해도 충분.

    리프 노드들에서 다른 모든 리프 노드 까지의 가중치를 구하는 것은 결국
    모든 노드까지의 거리를 구하는 것이니.

    특정 리프노드에서 다이제스트라 알고리즘을 실행하며 가장 큰 가중치를 확인하게끔.
     */

    //입력기
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    //Node간의 연결 표시
    //num이 key인 Node에 연결된 Node들의 집합.
    static Map<Integer, List<Node>> graph;

    public static void main(String[] args) throws IOException {
        //node의 개수
        int n = Integer.parseInt(br.readLine());

        //node 에 연결된 다른 Node들 초기화
        init(n);

        //입력을 받아서 각 노드별 연결 정도 확인
        input(n);

        //결과 탐색 및 반환
        int result = searchResult(n);

        //결과 출력
        System.out.print(result);
    }

    //그래프 초기화 시키기 작업
    static void init(int n){
        graph = new HashMap<>();
        for(int i = 1;i<=n;i++){
            graph.put(i, new ArrayList<>());
        }
    }

    static void input(int n) throws IOException{
        //1번 루트 노드를 자식으로 하는 입력은 없으니
        //총 입력은 n-1 번
        StringTokenizer st;
        for(int i = 1;i<n;i++){
            st= new StringTokenizer(br.readLine());

            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            graph.get(parent).add(new Node(child, weight));
            graph.get(child).add(new Node(parent,weight));
        }
    }

    //리프 노드에서 다른 노드들까지의 거리 중 최댓값을 찾아서 반환.
    //이때 작업하는 방식은 루트 노드로 부터 가장 거리가 먼 Node를 찾고
    //그 이후 해당 먼 Node에서 다른 모든 노드들의 거리를 찾아 반환.
    static int searchResult(int n){
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
