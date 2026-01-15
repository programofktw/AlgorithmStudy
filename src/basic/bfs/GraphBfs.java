package basic.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class GraphBfs {
    private static boolean[][] field;

    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());

        int y = Integer.parseInt(st.nextToken());

        field = new boolean[y][x];

        visited = new boolean[y][x];

        for(int i = 0 ; i<y;i++){
            st = new StringTokenizer(br.readLine(), " ");

            int j=0;
            while(st.hasMoreTokens()){
                int N = Integer.parseInt(st.nextToken());

                field[i][j++]= N==1;
            }
        }

        bfs();
    }

    public static void bfs(){
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(0,0));

        visited[0][0] = true;

        if (!field[0][0]&&!field[field.length-1][field[0].length-1]) {
            System.out.println("No");
            return;
        }

        while(!queue.isEmpty()){
            Node now = queue.poll();

            if(now.x == field[0].length-1&&now.y==field.length-1){
                System.out.print("Yes");
                return;
            }

            if(checkIndex(now.x+1,now.y)&&!visited[now.y][now.x+1]&&field[now.y][now.x+1]){
                visited[now.y][now.x+1] = true;
                queue.add(new Node(now.x+1,now.y));
            }
            if(checkIndex(now.x,now.y+1)&&!visited[now.y+1][now.x]&&field[now.y+1][now.x]){
                visited[now.y+1][now.x] = true;
                queue.add(new Node(now.x,now.y+1));
            }
        }

        System.out.print("No");
    }

    private static boolean checkIndex(int x, int y){
        if (y < 0 || y >= field.length) return false;
        if (x < 0 || x >= field[0].length) return false;

        return true;
    }

    private static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
