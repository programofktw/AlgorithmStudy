package bkd.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B2583 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static StringBuilder sb = new StringBuilder();

    private static boolean[][] visited;

    private static int[] dirX = {0,-1,0,1};

    private static int[] dirY = {-1,0,1,0};

    public static void main(String[] args) throws IOException {

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int m = input[0];

        int n = input[1];

        int num = input[2];

        visited = new boolean[m][n];

        int areaNum = 0;

        ArrayList<Integer> area = new ArrayList<>();

        for(int i = 0;i<num;i++){
            input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int startX = input[0];

            int startY = input[1];

            int endX = input[2]-1;

            int endY = input[3]-1;

            for(int y = startY;y<=endY;y++){
                for(int x = startX;x<=endX;x++){
                    visited[y][x] = true;
                }
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0 ; j<n;j++){
                if(!visited[i][j]){
                    Queue<Node> bfs = new LinkedList<>();

                    bfs.add(new Node(i,j));
                    visited[i][j] = true;
                    areaNum++;

                    int tempNum = 1;

                    while(!bfs.isEmpty()){
                        Node now = bfs.poll();


                        for(int dir=0;dir<4;dir++){

                            int nextX = now.x + dirX[dir];

                            int nextY = now.y + dirY[dir];

                            if(nextX < 0||nextX>=n||nextY<0||nextY>=m){
                                continue;
                            }

                            if(!visited[nextY][nextX]){
                                bfs.add(new Node(nextY,nextX));
                                visited[nextY][nextX] = true;
                                tempNum++;
                            }
                        }
                    }
                    area.add(tempNum);

                }
            }
        }

        Object[] array = area.toArray();

        Arrays.sort(array);

        sb.append(areaNum).append("\n");

        for(int i = 0 ; i < array.length;i++){
            sb.append(array[i]).append(" ");
        }

        System.out.print(sb);
    }

    static class Node{
        int y;
        int x;

        Node(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
}
