package baekjoon.class4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon1753 {

    
    //방문한 곳 표시 겸 값 저장
    static int[] visited;

    
    //다음에 방문할 곳을 최소 코스트 순으로 결정하도록 하는 Queue
    static PriorityQueue<Node> costQueue = new PriorityQueue<>(
            Comparator.comparingInt(o -> o.cost)
    );

    
    //방향 그래프의 내용을 저장, Key 시작점, List<Node> 다음 Node들과 코스트
    static HashMap<Integer, List<Node>> graph = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //Node 개수
        int N = Integer.parseInt(st.nextToken());

        //간선 개수
        int V = Integer.parseInt(st.nextToken());


        //시작점
        int K = Integer.parseInt(br.readLine());


        //후처리 귀찮으니 N+1 크기로 하고 Node 값에 맞게 실행
        visited = new int[N+1];



        //아직 탐색을 하지 않은 경우 -1로 저장(가중치에 음수가 없기에)
        //i에서 이어질 수 있는 Node를 담을 자료구조 할당.
        for(int i = 1 ;i<=N;i++){
            visited[i] = -1;
            graph.put(i,new ArrayList<>());
        }

        for(int i = 0;i<V;i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());

            int end = Integer.parseInt(st.nextToken());

            int cost = Integer.parseInt(st.nextToken());

            //그래프의 시작노드, 종료 노드 결정.
            graph.get(start).add(new Node(end, cost));
        }

        //시작점 대입
        costQueue.add(new Node(K,0));

        while(!costQueue.isEmpty()){
            //현재 Queue에 들은 것중 가장 가중치가 작은 것 빼오기
            Node now = costQueue.poll();
            if (visited[now.index] != -1 && visited[now.index] <= now.cost) continue;

            visited[now.index] = now.cost;
            //주변 Node들을 다 불러옴
            for(Node nig : graph.get(now.index)){
                int newCost = nig.cost + now.cost;
                //아직 방문 한 적 없는 노드의 경우
                if(visited[nig.index] == -1 || visited[nig.index] > newCost){
                    costQueue.add(new Node(nig.index, newCost));
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<visited.length;i++){
            if(visited[i] == -1){
                sb.append("INF").append("\n");
            }else{
                sb.append(visited[i]).append("\n");
            }
        }

        System.out.print(sb);

    }

    static class Node{
        int index;
        int cost;

        Node(int i, int c){
            index =i;
            cost = c;
        }
    }
}
