package basic.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*
특정 노드에서 다른 모든 노드까지의 최단 거리를 구하는 알고리즘.

음수 가중치가 있을 경우에는 쓸 수 없음.

해당 문제에선 방향 없는 그래프를 기준.
 */
public class Dijkstra {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    static int[] distance;

    static Map<Integer, List<Node>> graph = new HashMap<>();
    
    public static void main(String[] args) throws IOException {

        //Node의 개수
        int N = Integer.parseInt(br.readLine());

        //간선의 개수
        int E = Integer.parseInt(br.readLine());        
        
        //0 은 사용하지 않고 1 ~ N를 사용하며 특정 Node 부터 다른 Node들 까지의 거리.
        init(N);

        input(E);

        //입력 특정 노드
        dijkstra(Integer.parseInt(br.readLine()));

        printDistance();
    }
    //다익스트라 알고리즘
    private static void dijkstra(int base){
        //우선 순위 큐를 이용.
        PriorityQueue<Node> queue = new PriorityQueue<>(
                Comparator.comparingInt(node -> node.cost)
        );

        //시작점을 Queue에 추가한 채로 시작
        queue.add(new Node(base, 0));

        //중요 포인트
        distance[base] = 0;

        //Queue를 빼고 시작
        while(!queue.isEmpty()){
            //가장 최근의 노드를 poll
            Node now = queue.poll();

            //만약 추가하려는 값이 기존 최솟 값보다 크거나 같다면
            //같은 과정이 반복될테니 제외
            //이때 now.cost와 distance[now.to] 가 같은 경우는 최솟값을 최초로 집어 넣을 때만 해당
            if(now.cost > distance[now.to]) continue;

            //값의 갱신이 이루어져야한다면 해당 Node와 이어진 모든 Node들을 탐색
            for(Node next : graph.get(now.to)){
                //다음으로 이어지는 Cost를 구함.
                int nextDistance = now.cost + next.cost;

                //이어지는 cost가 최신 distance보다 작을 경우
                if(nextDistance < distance[next.to]){
                    //해당 값을 Queue에 추가.
                    distance[next.to] = nextDistance;
                    queue.add(new Node(next.to, nextDistance));
                }
            }
        }
    }

    //초기화 과정
    private static void init(int N) {
        distance = new int[N +1];

        //거리의 초기값을 최댓값으로 지정.
        Arrays.fill(distance,Integer.MAX_VALUE);

        //Graph 초기화
        for(int i = 1; i<= N; i++){
            graph.put(i, new ArrayList<>());
        }
    }
    //입력 과정
    private static void input(int E) throws IOException {
        StringTokenizer st;

        //그래프 입력
        for(int i = 0; i< E; i++){
            //입력의 형태는 (from) (to) (cost)
            st = new StringTokenizer(br.readLine());

            //시작 노드
            int from = Integer.parseInt(st.nextToken());
            //도착 노드
            int to = Integer.parseInt(st.nextToken());
            //비용
            int cost = Integer.parseInt(st.nextToken());
            
            //양 방향이기 때문에 둘 모두에 입력
            graph.get(from).add(new Node(to, cost));
            graph.get(to).add(new Node(from, cost));
        }
    }
    //결과 출력 과정
    private static void printDistance() {
        int count = 0 ;
        for(int i : distance){
            if(count==0){
                count++;
                continue;
            }

            if(i == Integer.MAX_VALUE)
                sb.append(String.format("%3s", "INF")).append(" ");
            else
                sb.append(String.format("%3d", i)).append(" ");
        }

        System.out.print(sb);
    }

    static class Node{
        int to;
        int cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}

//Test Case 1
/*
입력
5
6
1 2 2
1 3 3
2 3 2
2 4 4
3 4 1
4 5 1
1

0   2   3   4   5
*/
//Test Case 2
/*
입력
4
4
1 2 1
2 3 2
3 4 3
1 4 10
1

출력
0   1   3   6
*/
//Tast Case 3
/*
입력
3
2
1 2 5
2 3 2
2

출력
 7   0   2
 */
