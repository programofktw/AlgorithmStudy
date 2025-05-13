package baekjoon.class4;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
N과 M 5번
기존 1 ~ N 까지였던 문제에서

N개의 숫자로 M 개의 순열을 만드는 것으로 변경.

크기 순으로 정렬하는 것이 중요

 */
public class BaekJoon15654 {

    static int N;
    static int M;
    static boolean[] visited;

    static PriorityQueue<Integer> input = new PriorityQueue<>();
    static ArrayList<Integer> nums = new ArrayList<>();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();

        M = scan.nextInt();

        visited = new boolean[N];

        for(int i = 0 ;i<N;i++){
            input.add(scan.nextInt());
        }

        for(int i=0;i<N;i++){
            nums.add(input.poll());
        }

        for(int i = 0 ;i<N;i++){
            visited[i] = true;
            dfs(1,nums.get(i).toString());
            visited[i] = false;
        }

    }

    static void dfs(int depth, String now){
        if(depth == M) System.out.println(now);

        else{
            for(int i = 0;i<N;i++){
                if(!visited[i]){
                    visited[i] = true;
                    dfs(depth+1, now+" "+nums.get(i));
                    visited[i] = false;
                }
            }
        }

    }

}
