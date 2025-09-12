package baekjoon.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon1987 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static char[][] field;

    static boolean[] visitedAlph = new boolean[27];

    static int[] moveX = {0,-1,0,1};
    static int[] moveY = {-1,0,1,0};

    public static void main(String[] args) throws IOException{

        init();

        solved();
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(st.nextToken());

        field = new char[R][C];

        for(int i = 0; i < R;i++){
            char[] rInput = br.readLine().toCharArray();
            int c = 0;
            for(char input : rInput){
                field[i][c++] = input;
            }
        }
    }

    private static void solved(){
        int result = dfs(0,0,1);

        System.out.print(result);
    }

    private static int dfs(int r, int c, int weight){
        if(visitedAlph[field[r][c] - 'A']) return weight;

        visitedAlph[field[r][c] - 'A'] = true;

        int max = weight;

        for(int i = 0; i<4;i++){
            if(canMove(r + moveY[i],c + moveX[i])){
                int move = dfs(r + moveY[i], c+ moveX[i], weight+1);
                max = Math.max(max, move);
            }
        }

        visitedAlph[field[r][c]-'A'] = false;
        return max;
    }

    private static boolean canMove(int r, int c){
        if(r<0) return false;

        if(field.length<=r) return false;

        if(field[0].length<=c) return false;

        if(c<0) return false;

        if(visitedAlph[field[r][c] - 'A']) return false;

        return true;
    }

    private class Node{
        int weight;

        int r;
        int c;

        public Node(int weight, int r, int c) {
            this.weight = weight;
            this.r = r;
            this.c = c;
        }
    }
}
