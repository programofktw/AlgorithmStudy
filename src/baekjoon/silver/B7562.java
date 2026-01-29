package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class B7562 {

    private static boolean[][] visited;

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static int goalX;
    private static int goalY;

    private static int[] moveX = {-1,1,-2,-2,-1,1,2,2};
    private static int[] moveY = {-2,-2,-1,1,2,2,-1,1};

    private static PriorityQueue<Node> queue ;

    public static void main(String[] args) throws IOException {

        int testCase = Integer.parseInt(br.readLine());

        for(int t=0;t<testCase;t++){
            int fieldSize = Integer.parseInt(br.readLine());

            visited = new boolean[fieldSize][fieldSize];

            queue= new PriorityQueue<Node>(Comparator.comparing(o->o.count));

            String input = br.readLine();

            int x = Integer.parseInt(input.split(" ")[0]);
            int y = Integer.parseInt(input.split(" ")[1]);

            queue.add(new Node(x,y,0));

            input = br.readLine();
            goalX = Integer.parseInt(input.split(" ")[0]);
            goalY = Integer.parseInt(input.split(" ")[1]);

            while(!queue.isEmpty()){
                Node now = queue.poll();

                if(visited[now.y][now.x]){
                    continue;
                }

                visited[now.y][now.x] = true;
                if(now.x == goalX && now.y == goalY){
                    System.out.println(now.count);
                    break;
                }
                for(int i = 0 ; i < moveX.length ; i++){
                    if(canMove(now.x+moveX[i],now.y+moveY[i])){
                        queue.add(new Node(now.x+moveX[i],now.y+moveY[i],now.count+1));
                    }
                }
            }
        }

    }

    static boolean canMove(int x, int y){
        return x >= 0 && y >= 0 && x < visited.length && y < visited.length && !visited[y][x];
    }

    private static class Node{
        int x;
        int y;
        int count;

        Node(int x, int y, int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

}
