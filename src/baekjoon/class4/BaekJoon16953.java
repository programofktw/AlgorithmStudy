package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon16953 {

    static long B;

    static Queue<Temp> bfsQueue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        solved(A);
    }

    public static void solved(long A){
        bfsQueue.add(new Temp(A,0));

        long result = -1;

        while(!bfsQueue.isEmpty()){
            Temp now = bfsQueue.poll();

            if(now.now==B){
                result = now.depth+1;
                break;
            }

            if(now.now*2<=B){
                bfsQueue.add(new Temp(now.now*2, now.depth+1));
            }
            if(now.now*10+1<=B){
                bfsQueue.add(new Temp(now.now*10+1, now.depth+1));
            }
        }

        System.out.println(result);
    }

    static class Temp{
        long now;
        int depth;

        private Temp(long now, int depth){
            this.now= now;
            this.depth = depth;
        }
    }
}
