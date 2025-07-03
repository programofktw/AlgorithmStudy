package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon9019 {

    public static Scanner scan = new Scanner(System.in);

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static Queue<Node> discoveryList;

    static boolean[] visited; // 방문 여부 체크 배열


    public static StringBuilder sb = new StringBuilder();
    public static int target;

    public static void main(String[] args) throws IOException {

        int testCaseNum = Integer.parseInt(br.readLine());

        for(int i = 0 ;i<testCaseNum;i++){
            String[] testCase = br.readLine().split(" ");

            visited = new boolean[10000]; // 0000~9999 숫자 범위

            int base = Integer.parseInt(testCase[0]);
            target = Integer.parseInt(testCase[1]);
            discoveryList  = new LinkedList<>();
            discoveryList.add(new Node(0,base,""));

            Node result = bfs(discoveryList.poll());

            sb.append(result.command).append("\n");
        }
        System.out.print(sb);

    }

    private static Node bfs(Node node){
        if(node.state==target) return node;
        else{
            int dState = (2*node.state)%10000;

            int sState = (node.state-1+10000)%10000;

            int d1000 = node.state/1000;

            int d100 = (node.state %1000)/100;

            int d10 = (node.state % 100)/10;

            int d1 = (node.state %10);

            int rState = d1 * 1000 + d1000 * 100 + d100 * 10 + d10;

            int lState = d100 * 1000 + d10 * 100 + d1 *10 + d1000;

            if(!visited[dState]){
                visited[dState] = true;
                discoveryList.add(new Node(node.depth+1, dState, node.command+ "D"));
            }
            if(!visited[lState]){
                visited[lState] = true;
                discoveryList.add(new Node(node.depth+1, lState, node.command + "L"));
            }
            if(!visited[rState]){
                visited[rState] = true;
                discoveryList.add(new Node(node.depth+1, rState, node.command + "R"));
            }
            if(!visited[sState]){
                visited[sState] =true;
                discoveryList.add(new Node(node.depth+1, sState, node.command + "S"));
            }


            return bfs(discoveryList.poll());
        }
    }


}

class Node{
    int depth;
    int state;
    String command;
    Node(int depth, int state, String command){
        this.depth = depth;
        this.state = state;
        this.command =command;
    }

}

