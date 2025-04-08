package baekjoon.class3;


import java.util.Scanner;

/*
 백트래킹 예제 문제라고 한다
 N X M (1)
 자연수 1 부터 N 까지 중복 없이 M개 고른 수열.
 */
public class BaekJoon15649 {

    static StringBuilder result = new StringBuilder();
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int M = scan.nextInt();

        visited = new boolean[N];

        arr = new int[M];

        dfs(N,M,0);

        System.out.print(result);

    }

    public static void dfs(int N, int M, int depth){
        if(M==depth){
            for(int val : arr){
                result.append(val).append(" ");
            }
            result.append("\n");
        }

        else{
            for(int i =0;i<N;i++){
                if(!visited[i]){
                    visited[i] = true;
                    arr[depth] = i+1;
                    dfs(N,M,depth+1);


                    visited[i] = false;
                }
            }
        }
    }
}
