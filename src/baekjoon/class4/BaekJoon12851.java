package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//1회차 메모리 초과
public class BaekJoon12851 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());


        int from = Integer.parseInt(st.nextToken());

        int to = Integer.parseInt(st.nextToken());

        if(from>=to){
            System.out.println(from-to);
            System.out.println(1);
            return;
        }

        bfs(from, to);

    }

    private static void bfs(int from, int to){
        PriorityQueue<Node> queue = new PriorityQueue<>(
                Comparator.comparingInt(node->node.time)
        );

        queue.add(new Node(from,0));

        int minTime = Integer.MAX_VALUE;

        int count = 0;

        while(!queue.isEmpty()){
            Node now = queue.poll();

            //만약 최소 시간보다 초과한 경우 볼 필요가 없음.
            if(now.time > minTime){
                continue;
            }

            if(now.X == to){
                int time = now.time;

                if(time==minTime){
                    count++;
                }

                else if(time < minTime){
                    minTime = time;
                    count = 1;
                }
            }
            else if(now.X != to){
                queue.add(new Node(now.X +1,now.time+1));
                queue.add(new Node(now.X -1,now.time+1));
                queue.add(new Node(now.X  * 2,now.time+1));
            }
        }

        System.out.print(minTime+"\n"+count);
    }

    static class Node{
        int X;

        int time;

        Node(int X, int time){
            this.X = X;
            this.time = time;
        }
    }
}
