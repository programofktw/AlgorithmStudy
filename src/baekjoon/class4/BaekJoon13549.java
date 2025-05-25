package baekjoon.class4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon13549 {

    static PriorityQueue<Node> queue = new PriorityQueue<>(
            Comparator.comparingInt(o -> o.count)
    );

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();


        if(start>=end) {
            System.out.print(start - end);
            return;
        }

        queue.add(new Node(start,0));

        boolean[] visited = new boolean[end*2+1];



        while(!queue.isEmpty()) {
            Node now = queue.poll();
            int preIndex = now.index-1;
            int postIndex = now.index+1;
            int multiIndex = now.index*2;

            if(now.index == end){
                System.out.print(now.count);
                return;
            }

            if(preIndex>=0&&!visited[preIndex]){
                visited[preIndex] = true;
                queue.add(new Node(preIndex, now.count+1));
            }

            if(postIndex < visited.length&&!visited[postIndex]){
                visited[postIndex] = true;
                queue.add(new Node(postIndex, now.count+1));
            }

            if(multiIndex <= end *2 && !visited[multiIndex]){
                visited[multiIndex] = true;
                queue.add(new Node(multiIndex, now.count));
            }
        }

    }

    static class Node{
        int index;
        int count;

        Node(int index, int count){
            this.index = index;
            this.count = count;
        }
    }


}
