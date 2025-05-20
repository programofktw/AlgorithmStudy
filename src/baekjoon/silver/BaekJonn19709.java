package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BaekJonn19709 {

    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input(br);
        solved();
    }

    private static void solved() {
        int count =0 ;
        while(N>=0&&!priorityQueue.isEmpty()){
            int now = priorityQueue.poll();
            N -= now;
            if(N<0) break;
            count++;
        }

        System.out.print(count);
    }

    private static void input(BufferedReader br) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 0 ;i<M;i++) {
            priorityQueue.add(Integer.parseInt(br.readLine()));
        }
    }
}
