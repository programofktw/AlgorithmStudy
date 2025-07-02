package baekjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
BFS 문제
*/
public class BaekJoon11123 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int y;
    static int x;


    static int[] moveX = {0,1,0,-1};
    static int[] moveY = {-1,0,1,0};

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T;i++){
            System.out.println(testCase());
        }
    }

    private static int testCase() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        boolean[][] feild = new boolean[y][x];


        for (int i = 0; i < y; i++) {
            String line = br.readLine();
            for (int j = 0; j < x; j++) {
                feild[i][j] = (line.charAt(j) == '#');
            }
        }

        return bfs(feild);
    }

    private static int bfs(boolean[][] feild){
        int result = 0;

        Queue<Point> queue = new LinkedList<>();

        boolean[][] visited = new boolean[y][x];

        for(int i = 0;i<y;i++){
            for(int j = 0;j<x;j++){
                if(!visited[i][j]&&feild[i][j]){
                    queue.add(new Point(i,j));
                    result++;
                    while(!queue.isEmpty()){
                        Point now = queue.poll();
                        visited[now.y][now.x] = true;
                        for(int h = 0;h<4;h++){
                            int nextX = now.x + moveX[h];
                            int nextY = now.y + moveY[h];

                            if(nextX<0||nextX>=x||nextY<0||nextY>=y) continue;
                            else if(!visited[nextY][nextX]&&feild[nextY][nextX]) queue.add(new Point(nextY,nextX));
                        }
                    }
                }
            }

        }


        return result;
    }


    private static class Point{
        int y;
        int x;

        Point(int y,int x){
            this.y = y;
            this.x= x;
        }
    }
}
