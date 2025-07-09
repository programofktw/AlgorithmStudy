package basic.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS  extends AbstractTreeAlogorithm{

    public static void main(String[] args){
        printAsBinaryTree();
        System.out.print("BFS : ");
        bfs();
    }

    private static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while(!queue.isEmpty()){
            int parent = queue.poll();
            System.out.print(parent+" -> ");
            int left = parent*2+1;
            int right = parent*2+2;

            if(left>=field.length) continue;
            else if(right>=field.length) queue.add(left);
            else{
                queue.add(left);
                queue.add(right);
            }
        }

    }

}
