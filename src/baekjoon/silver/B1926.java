package baekjoon.silver;

import java.awt.desktop.PreferencesEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1926 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb = new StringBuilder();

    private static boolean[][] field;

    private static boolean[][] visited;

    private static Queue<Node> queue = new LinkedList<>();

    private static int artNum = 0;
    private static int maxNum =0;

    private static void input() throws IOException {
        StringTokenizer st;
        for(int i = 0; i< field.length;i++){
            int j = 0;
            st= new StringTokenizer(br.readLine(), " ");

            while(st.hasMoreTokens()){
                field[i][j++] = st.nextToken().equals("1");
            }
        }
    }

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        field = new boolean[n][m];

        input();

        visited = new boolean[n][m];

        for(int i = 0; i < field.length;i++){
            for(int j = 0 ; j<field[i].length;j++){
                if(field[i][j]&&!visited[i][j]){
                    artNum++;
                    bfs(i,j);
                }
            }
        }

        sb.append(artNum).append("\n").append(maxNum);

        System.out.println(sb);

    }
    //0 - 왼
    //1 - 위
    //2 - 오
    //3 - 아래
    private static int[] dx = {-1,0,1,0};
    private static int[] dy = {0,-1,0,1};

    private static void bfs(int y, int x){
        queue.add(new Node(y,x));
        int count=0;


        while(!queue.isEmpty()){
            Node now = queue.poll();
            if(visited[now.y][now.x]){
                continue;
            }
            count++;
            visited[now.y][now.x] = true;

            for(int i = 0 ; i < 4;i++){
                int nextX = now.x + dx[i];
                int nextY = now.y + dy[i];

                if(checkPosition(nextY, nextX)){
                    if(!visited[nextY][nextX]&&field[nextY][nextX]){
                        queue.add(new Node(nextY, nextX));
                    }
                }
            }
        }
        if(count> maxNum){
            maxNum = count;
        }
    }

    private static boolean checkPosition(int y, int x){
        if(y<0||y>=field.length){
            return false;
        }
        if(x<0||x>=field[0].length){
            return false;
        }
        return true;
    }





    private static class Node{
        int x;
        int y;

        Node(int y, int x){
            this.x = x;
            this.y = y;
        }
    }
}
